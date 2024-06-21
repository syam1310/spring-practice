package org.example.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("personBean")
@Lazy /*By Default it is the Egar Initialization*/
public class Person {
    private String name = "Shyam";

    Person() {
        System.out.println("Person object is created");
    }
    /*private final Vehicle vehicle;

    @Autowired
    Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }*/
}
