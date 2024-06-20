package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/*
 * Spring @Configuration annotation is part of spring core framework.
 * Spring Configuration annotation indicates that the class has @Bean definition method.
 * So Spring container can process the class and generate Spring Beans to be used in the application.
 * */

@Configuration
public class ProjectConfig {

    /*
     * @Bean annotation, which lets spring know that it needs to call this method when it initializes its context and
     * adds the returned value to the context.
     * */

    /*
     * if we do not want the bean name which is provided by spring context, we can provide the custom name using name and value
     * */

    @Bean(name = "audiVehicle")
    Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi 8");
        return vehicle;
    }

    @Bean(value = "hondaCityVehicle")
    Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda city");
        return vehicle;
    }

    /*
     * When you have multiple beans of the same kind inside the Spring context, you can make one of them primary by using @Primary annotation.
     * Primary bean is the one which Spring will choose if it has multiple options and you do not specify a name then Spring context will the
     * bean which is annotated the @Primary
     * In other words, it is the default bean that spring context will consider in case of confusion due to the multiple beans present of same type.
     * */
    @Primary
    @Bean(value = "ferrariVehicle")
    Vehicle vehicle3() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("FerrariVehicle");
        return vehicle;
    }


    @Bean
    String hello() {
        return "Hello World!";
    }

    @Bean
    Integer number() {
        return 328;
    }

}
