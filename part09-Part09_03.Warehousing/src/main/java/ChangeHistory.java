import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    public void add(double status) {
        history.add(status);
    }
    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }
    public double maxValue() {
        double max = 0.0;
        for (Double d : history) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }
    public double minValue() {
        if (history.isEmpty()) {
            return 0.0;
        }
        double min = history.get(0);
        for (Double d : history) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }
    public double average() {
        if (history.isEmpty()) {
            return 0.0;
        }
        int count = 0;
        double sum = 0.0;
        for (Double d : history) {
            sum += d;
            count++;
        }
        return sum / count;
    }
}
