package application;

public class StandardSensor implements Sensor {
    private int i;
    public StandardSensor(int i) {
        this.i = i;
    }
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return i;
    }
}
