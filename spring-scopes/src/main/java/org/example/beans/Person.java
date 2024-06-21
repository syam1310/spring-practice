package org.example.beans;

import org.example.beans.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
/*@Scope(BeanDefinition.SCOPE_SINGLETON)*/
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Person {
    private String name = "Shyam";
    private final Vehicle vehicle;

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
    }
}
