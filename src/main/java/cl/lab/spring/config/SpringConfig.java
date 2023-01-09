package cl.lab.spring.config;

import cl.lab.spring.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean()
    public Car Car(){
        return new Car();
    }
}
