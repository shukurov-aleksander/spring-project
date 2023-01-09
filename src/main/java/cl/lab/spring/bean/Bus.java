package cl.lab.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bus {
    @Value("Iveco")
    private String manufacturer;
    @Value("2015")
    private int yearOfIssue;

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void drive() {
        System.out.println("bus is driving");
    }
}
