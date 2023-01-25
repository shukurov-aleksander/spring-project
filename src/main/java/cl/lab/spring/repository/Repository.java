package cl.lab.spring.repository;

import cl.lab.spring.interfac.RepositoryInterface;
import cl.lab.spring.annotation.Transaction;
import org.springframework.stereotype.Component;

@Component
public class Repository implements RepositoryInterface {
    @Transaction
    public void save() {
        System.out.println("Тело метода save()");
            throw new RuntimeException();
    }
}
