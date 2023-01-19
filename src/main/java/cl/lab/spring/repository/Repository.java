package cl.lab.spring.repository;

import cl.lab.spring.annotation.Transaction;
import org.springframework.stereotype.Component;

@Component
@Transaction
public class Repository {
    public void save() {
            throw new RuntimeException();
    }
}
