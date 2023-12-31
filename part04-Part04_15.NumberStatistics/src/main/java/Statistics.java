import java.util.ArrayList;

public class Statistics {

    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    public Statistics() {

    }

    public void addNumber(int number) {
        this.numbers.add(number);
    }

    public int getCount() {
        return this.numbers.size();
    }

    public int sum() {
        int sum = 0;
        for (int i : this.numbers) {
            sum += i;
        }
        return sum;
    }

    public double average() {
        if (getCount() == 0) {
            return 0;
        }
        return (1.0 * sum()) / getCount();
    }

}
