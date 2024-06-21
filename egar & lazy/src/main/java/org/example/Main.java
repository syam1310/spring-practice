package org.example;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.example.service.VehicleService;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        /*
         * If we have the multiple bean with the same type, then we have to pass two parameter in the getBeans methods
         * one is Bean name and another is the Bean type.
         * */


        System.out.println("Before retrieving the person object from the spring context");
        Person person = applicationContext.getBean(Person.class);


        System.out.println("After retrieving the person object from the spring context");



    }
}