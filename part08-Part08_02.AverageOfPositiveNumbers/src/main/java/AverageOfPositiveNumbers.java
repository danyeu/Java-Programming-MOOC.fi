
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long count = 0;
        long sum = 0;
        while (true) {
            Integer i = Integer.parseInt(scanner.nextLine());
            if (i == 0) {
                break;
            }
            if (i > 0) {
                sum += i;
                count++;
            }
        }
        if (count > 0) {
            System.out.println((1.0 * sum) / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
