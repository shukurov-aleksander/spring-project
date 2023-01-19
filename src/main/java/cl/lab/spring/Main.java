package cl.lab.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("cl.lab.spring");
        ctx.getBean("repository");
        //System.out.println("Класс " + ctx.getBean(Table.class).getClass().getSimpleName());
        //ApplicationContext contextSecond = new AnnotationConfigApplicationContext(AppConfig.class);
        //System.out.println("Класс " + contextSecond.getBean(Table.class).getClass().getSimpleName());
    }
}