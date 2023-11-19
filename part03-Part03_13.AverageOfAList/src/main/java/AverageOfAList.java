
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }

        Integer sum = 0;

        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Average: " + (1.0 * sum) / list.size());
    }
}
