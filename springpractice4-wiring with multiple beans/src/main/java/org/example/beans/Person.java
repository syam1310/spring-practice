package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Shyam";
    /*@Autowired
    @Qualifier("vehicle3")*/
    private final Vehicle vehicle;

    @Autowired
    Person(@Qualifier("vehicle3") Vehicle vehicle1){
        this.vehicle = vehicle1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
