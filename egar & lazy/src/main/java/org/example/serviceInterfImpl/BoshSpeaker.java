package org.example.serviceInterfImpl;

import org.example.serviceInterf.Speakers;
import org.springframework.stereotype.Component;

@Component("boshSpeaker")
public class BoshSpeaker implements Speakers {

    @Override
    public String makeSound() {
        return "Playing music with the help of Bosh Speaker";
    }
}
