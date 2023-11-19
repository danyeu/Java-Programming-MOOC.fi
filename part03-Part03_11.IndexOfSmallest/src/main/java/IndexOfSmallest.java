
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        Integer smallest = Integer.MAX_VALUE;

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            if (number < smallest) {
                smallest = number;
            }
            numbers.add(number);
        }

        if (!numbers.isEmpty()) {
            System.out.println("Smallest number: " + smallest);

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i).equals(smallest)) {
                    System.out.println("Found at index: " + i);
                }
            }
        }

    }
}
