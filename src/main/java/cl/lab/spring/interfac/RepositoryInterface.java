package cl.lab.spring.interfac;

import cl.lab.spring.annotation.Transaction;

public interface RepositoryInterface {
    @Transaction
    void save();
}
