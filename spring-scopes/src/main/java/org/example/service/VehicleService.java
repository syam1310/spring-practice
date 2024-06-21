package org.example.service;

import org.example.serviceInterf.Speakers;
import org.example.serviceInterf.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
/*@Scope(BeanDefinition.SCOPE_SINGLETON)*/
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleService {

    @Autowired
    @Qualifier("boshSpeaker")
    private Speakers speakers;

    @Autowired
    @Qualifier("michelinTyre")
    private Tyre tyre;

    public void playMusic() {
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void rotate() {
        String rot = tyre.rotate();
        System.out.println(rot);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
