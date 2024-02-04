
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();
        while (true) {
            Integer i = Integer.parseInt(scanner.nextLine());
            if (i < 0) {
                break;
            }
            ints.add(i);
        }
        ints.stream().filter(i -> (i >= 1 & i <= 5)).forEach(System.out::println);
    }
}
