package org.example.serviceInterfImpl;

import org.example.serviceInterf.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speakers {
    @Override
    public String makeSound() {
        return "Playing Music with the help of Sony Speaker";
    }
}
