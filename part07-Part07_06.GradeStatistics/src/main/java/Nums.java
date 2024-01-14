import java.util.ArrayList;

public class Nums {
    private ArrayList<Integer> numbers;
    private Integer passingGrade = 50;
    public Nums() {
        this.numbers = new ArrayList<>();
    }

    public void add(Integer i) {
        if (validNumber(i)) {
            numbers.add(i);
        }
    }

    public boolean validNumber(Integer i) {
        if (i < 0 | i > 100) {
            return false;
        }
        return true;
    }

    public double avg() {
        int count = 0;
        int sum = 0;
        for (Integer i : numbers) {
            sum += i;
            count++;
        }
        return (1.0 * sum) / count;
    }

    public double avgPassing() {
        int count = 0;
        int sum = 0;
        for (Integer i : numbers) {
            if (i < passingGrade) {
                continue;
            }
            sum += i;
            count++;
        }
        return (1.0 * sum) / count;
    }

    public double passPercentage() {
        int count = 0;
        for (Integer i : numbers) {
            if (i >= passingGrade) {
                count ++;
            }
        }
        return (100.0 * count) / numbers.size();
    }

    public void printDistribution() {
        // grade 0,1,2,3,4,5
        int[] counts = {0,0,0,0,0,0};
        for (Integer i  : numbers) {
            if (i < 50) {
                counts[0]++;
            } else if (i < 60) {
                counts[1]++;
            } else if (i < 70) {
                counts[2]++;
            } else if (i < 80) {
                counts[3]++;
            } else if (i < 90) {
                counts[4]++;
            } else {
                counts[5]++;
            }
        }
        System.out.println("Grade distribution:");
        for (int i = counts.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < counts[i]; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
