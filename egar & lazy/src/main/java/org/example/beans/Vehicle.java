package org.example.beans;

import org.example.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component(value = "vehicleBean")
public class Vehicle {
    private String name = "Honda";


    private final VehicleService vehicleService;

    @Autowired
    Vehicle(VehicleService service){
        this.vehicleService = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public VehicleService getVehicleService() {
        return vehicleService;
    }
}
