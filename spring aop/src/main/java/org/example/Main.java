package org.example;

import org.example.config.ProjectConfig;
import org.example.model.Song;
import org.example.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService vehicleService = applicationContext.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass().getName());
        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");

        boolean vehicleStarted = true;
        String moveVehicleStatus = vehicleService.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleService.playMusic(vehicleStarted, song);
        System.out.println(playMusicStatus);
        String applyBreakStatus = vehicleService.applyBrake(vehicleStarted);


    }
}