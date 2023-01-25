package cl.lab.spring;

import cl.lab.spring.interfac.RepositoryInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("cl.lab.spring");
        RepositoryInterface bean = ctx.getBean(RepositoryInterface.class);
        bean.save();
        //System.out.println("Класс " + ctx.getBean(Table.class).getClass().getSimpleName());
        //ApplicationContext contextSecond = new AnnotationConfigApplicationContext(AppConfig.class);
        //System.out.println("Класс " + contextSecond.getBean(Table.class).getClass().getSimpleName());
    }
}