import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String pn = scanner.nextLine().trim();
        double avg;
        if (pn.equals("p")) {
            avg = inputs.stream()
                    .mapToInt(s -> Integer.parseInt(s))
                    .filter(i -> i > 0)
                    .average().getAsDouble();
            System.out.println("Average of the positive numbers: " + avg);
        } else {
            avg = inputs.stream()
                    .mapToInt(s -> Integer.parseInt(s))
                    .filter(i -> i <0)
                    .average().getAsDouble();
            System.out.println("Average of the negative numbers: " + avg);
        }



    }
}
