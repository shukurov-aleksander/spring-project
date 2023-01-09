package cl.lab.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanFromClass")
public class Car {
    @Value("Skoda")
    private String manufacturer;
    @Value("Octavia")
    private String model;
    @Value("2002")
    private int yearOfIssue;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
}
