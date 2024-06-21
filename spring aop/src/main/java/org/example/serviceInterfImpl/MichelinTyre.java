package org.example.serviceInterfImpl;

import org.example.serviceInterf.Tyre;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyre implements Tyre {
    @Override
    public String rotate() {
        return "Rotate with the help of MichelinTyre";
    }

    @Override
    public String stop() {
        return "Stop with the help of MichelinTyre";
    }
}
