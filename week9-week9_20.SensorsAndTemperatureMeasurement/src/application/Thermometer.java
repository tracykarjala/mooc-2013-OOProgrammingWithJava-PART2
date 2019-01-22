package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private Random random;
    private boolean isOn;

    public Thermometer() {
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public int measure() {
        if (!isOn) {
            throw new IllegalStateException("thermometer is off");
        }
        return ((random.nextInt(60) + 1) - 30);
    }
}
