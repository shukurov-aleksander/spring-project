package cl.lab.spring.bpp;

import cl.lab.spring.annotation.Sun;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class SunAnnotationBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        if (beanClass.isAnnotationPresent(Sun.class)) {
            System.out.println(beanClass.getSimpleName() + " аннотирован аннотацией " + Sun.class.getSimpleName());
        }
        return bean;
    }
}
