package cl.lab.spring.bean;

import cl.lab.spring.annotation.Replace;
import cl.lab.spring.annotation.Sun;
import org.springframework.stereotype.Component;

@Component
@Replace(newImpl = DinnerTable.class)
@Sun
public class Table {
    private long height;
    private long depth;
    private long age;
}
