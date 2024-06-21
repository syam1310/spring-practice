package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
 * Spring @Configuration annotation is part of spring core framework.
 * Spring Configuration annotation indicates that the class has @Bean definition method.
 * So Spring container can process the class and generate Spring Beans to be used in the application.
 *
 * To tell Spring it needs to search for classes annotated with stereotype annotations,
 * we use the @ComponentScan annotation over the configuration class.
 *
 * */

@Configuration
@ComponentScan(basePackages = "org.example.beans")
public class ProjectConfig {

    @Bean
    Vehicle vehicle1(){
        Vehicle veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Bean
    Vehicle vehicle3(){
        Vehicle veh = new Vehicle();
        veh.setName("Volkswagen");
        return veh;
    }


}
