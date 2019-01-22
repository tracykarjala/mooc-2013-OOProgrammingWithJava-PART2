package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensorList;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensorList = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        sensorList.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensorList) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensorList) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensorList) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn() || sensorList.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off or no sensors added");
        }
        int totalOfSensors = 0;
        for (Sensor sensor : sensorList) {
            totalOfSensors += sensor.measure();
        }
        readings.add((Integer)totalOfSensors/sensorList.size());
        return (Integer)totalOfSensors/sensorList.size();
    }

    public List<Integer> readings() {
        return readings;
    }
}
