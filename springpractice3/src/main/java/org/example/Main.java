package org.example;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
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

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audiVehicle = new Vehicle();
            audiVehicle.setName("Audi");
            return audiVehicle;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(9);
        System.out.println("Random Number is: "+ randomNumber);

        if(randomNumber%2 == 0){
            applicationContext.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        }else{
            applicationContext.registerBean("audiVehicle", Vehicle.class, audiSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;
        try {
            volksVehicle = applicationContext.getBean("volkswagen", Vehicle.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Error while creating volkswagen vehicle");
        }
        try {
            audiVehicle = applicationContext.getBean("audiVehicle", Vehicle.class);
        }catch (NoSuchBeanDefinitionException  e){
            System.out.println("Error while creating audi vehicle");
        }

        if(volksVehicle != null){
            System.out.println("Vehicle name is: "+volksVehicle.getName());
        }else {
            System.out.println("Vehicle name is: "+audiVehicle.getName());
        }
//        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
//        System.out.println(vehicle.getName());
//        applicationContext.close();



    }
}