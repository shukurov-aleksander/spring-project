package cl.lab.spring;

import cl.lab.spring.bean.Bus;
import cl.lab.spring.bean.Car;
import cl.lab.spring.bean.Door;
import cl.lab.spring.config.SpringConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Door door = context.getBean("doorBean", Door.class);

        System.out.println(door.getColor());

        System.out.println(door.getHeight());

        ApplicationContext contextSecond = new AnnotationConfigApplicationContext(SpringConfig.class);
        Car car = contextSecond.getBean("Car", Car.class);
        System.out.println(car.getManufacturer());
        System.out.println(car.getModel());
        System.out.println(car.getYearOfIssue());

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "context.xml");
        Bus bus = (Bus)ctx.getBean("bus");
        System.out.println(bus.getManufacturer());
        System.out.println(bus.getYearOfIssue());
        bus.drive();
    }
}

