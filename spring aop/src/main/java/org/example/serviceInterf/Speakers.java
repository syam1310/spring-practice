package org.example.serviceInterf;

import org.example.model.Song;
import org.springframework.stereotype.Service;

@Service
public interface Speakers {

    String makeSound(Song song);
}
