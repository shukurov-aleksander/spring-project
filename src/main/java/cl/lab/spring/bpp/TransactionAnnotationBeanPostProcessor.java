package cl.lab.spring.bpp;

import cl.lab.spring.annotation.Transaction;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

@Component
public class TransactionAnnotationBeanPostProcessor implements BeanPostProcessor {
    private Map<String, Class<?>> map = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        Method[] methods = beanClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Transaction.class)) {
                map.put(beanName, beanClass);
                System.out.println("Post processor before initialization");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = map.get(beanName);
        if (beanClass != null) {
           return Proxy.newProxyInstance(beanClass.getClassLoader(), beanClass.getInterfaces(), (proxy, method, args) -> {
               if (method.isAnnotationPresent(Transaction.class)) {
                   System.out.println("Transaction is opened");
                   try {
                       Object result = method.invoke(bean, args);
                       System.out.println("Result is saved");
                       System.out.println("Transaction is closed");
                       return result;
                   } catch (Exception e) {
                       System.out.println("Transaction is rollbacked");
                       return bean;
                   }
               }else {
                   return method.invoke(bean, args);
               }
           });
        }
        return bean;
    }
}

