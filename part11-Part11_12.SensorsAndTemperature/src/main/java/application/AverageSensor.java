package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor s: sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor s: sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s: sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        if (sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor has no sensors");
        }
        if (!isOn()) {
            throw new IllegalStateException("AverageSensor is not on");
        }

        int count = 0;
        int sum = 0;
        for (Sensor s: sensors) {
            count++;
            sum += s.read();
        }
        readings.add(sum / count);
        return sum / count;
    }
}
