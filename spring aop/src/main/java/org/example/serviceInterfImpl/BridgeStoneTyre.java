package org.example.serviceInterfImpl;

import org.example.serviceInterf.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre implements Tyre {
    @Override
    public String rotate() {
        return "Rotate with the help of BridgeStoneTyre";
    }

    @Override
    public String stop() {
        return "Stop with the help of BridgeStoneTyre";
    }
}
