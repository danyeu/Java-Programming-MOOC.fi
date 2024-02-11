package application;

import java.util.List;
import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean on;

    public TemperatureSensor(){
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        this.on = true;
    }

    @Override
    public void setOff() {
        this.on = false;
    }

    @Override
    public int read() {
        if (on) {
            return new Random().nextInt(61) - 30;
        }
        throw new IllegalStateException("TemperatureSensor is not on");
    }
}
