package cl.lab.spring.bfpp;

import cl.lab.spring.annotation.Replace;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class ReplaceBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
            String beanClassName = beanDefinition.getBeanClassName();
            try {
                if (beanClassName != null) {
                    Class<?> aClass = Class.forName(beanClassName);
                    if (aClass.isAnnotationPresent(Replace.class)) {
                        beanDefinition.setBeanClassName(aClass.getAnnotation(Replace.class).newImpl().getName());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
