package cl.lab.spring.config;

import cl.lab.spring.bean.Table;
import cl.lab.spring.bfpp.ReplaceBeanFactoryPostProcessor;
import cl.lab.spring.bpp.SunAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;

public class AppConfig {
//    @Bean
//    public Car car() {
//        return new Car();
//    }
//    @Bean
//    public Door door() {
//        return new Door();
//    }
//    @Bean
//    public Elephant elephant() {
//        return new Elephant();
//    }
//    @Bean
//    public Human human() {
//        return new Human();
//    }
//    @Bean
//    public Pen pen() {
//        return new Pen();
//    }
    @Bean
    public Table table() {
        return new Table();
    }
    @Bean
    public SunAnnotationBeanPostProcessor processor(){
        return new SunAnnotationBeanPostProcessor();
    }
    @Bean
    public ReplaceBeanFactoryPostProcessor postProcessor(){
        return new ReplaceBeanFactoryPostProcessor();
    }
}
