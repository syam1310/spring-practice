package org.example;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        /*
         * If we have the multiple bean with the same type, then we have to pass two parameter in the getBeans methods
         * one is Bean name and another is the Bean type.
         * */

        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        System.out.println(vehicle.getName());

        String hello = applicationContext.getBean(String.class);
        System.out.println(hello);

        Integer number = applicationContext.getBean(Integer.class);
        System.out.println(number);
    }
}