package org.example.service;

import org.example.interfaces.LogAspect;
import org.example.model.Song;
import org.example.serviceInterf.Speakers;
import org.example.serviceInterf.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class VehicleService {

    @Autowired
    @Qualifier("boshSpeaker")
    private Speakers speakers;

    @Autowired
    @Qualifier("michelinTyre")
    private Tyre tyre;

    private Logger logger = Logger.getLogger(VehicleService.class.getName());

    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song) {
       /* Instant start = Instant.now();
        logger.info("method execution started");*/
        /*String music = null;
        if (vehicleStarted) {
            music = speakers.makeSound(song);
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform this operation");
        }*/

        /*logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute method is: " + timeElapsed);*/
        return speakers.makeSound(song);
    }
    public String applyBrake(boolean vehicleStarted){
        /*Instant start = Instant.now();
        logger.info("method execution started");*/
       /* String status = null;
        if (vehicleStarted) {
            status = tyre.stop();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform this operation");
        }*/

        /*logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute method is: " + timeElapsed);*/
        return tyre.stop();
    }
    public String moveVehicle(boolean vehicleStarted){
        /*Instant start = Instant.now();
        logger.info("method execution started");*/
        /*String status = null;
        if (vehicleStarted) {
            status = tyre.rotate();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform this operation");
        }*/

        /*logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute method is: " + timeElapsed);*/
        return tyre.rotate();
    }
}
