package org.example.aspects;

import org.apache.commons.logging.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class VehicleStartCheckAspects {

    private Logger logger = Logger.getLogger(VehicleStartCheckAspects.class.getName());

    @Before("execution(* org.example.service.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable{
        if(!vehicleStarted){
            throw new RuntimeException("Vehicle Not Started!");
        }
    }
}
