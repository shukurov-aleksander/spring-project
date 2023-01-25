package cl.lab.spring.bean;

import cl.lab.spring.annotation.Replace;
import org.springframework.stereotype.Component;

@Component
@Replace(newImpl = DinnerTable.class)
public class Table {
    private long height;
    private long depth;
    private long age;
}
