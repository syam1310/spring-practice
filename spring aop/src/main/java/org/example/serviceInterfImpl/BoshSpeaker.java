package org.example.serviceInterfImpl;

import org.example.model.Song;
import org.example.serviceInterf.Speakers;
import org.springframework.stereotype.Component;

@Component("boshSpeaker")
public class BoshSpeaker implements Speakers {

    @Override
    public String makeSound(Song song) {
        return "Playing music with BoshSpeaker! \n Song name is "+ song.getTitle() +" and Singer is: "+ song.getSingerName();
    }
}
