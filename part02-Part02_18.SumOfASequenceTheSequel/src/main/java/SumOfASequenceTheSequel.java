
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int l = Integer.parseInt(scanner.nextLine());
        System.out.print("Last number? ");
        int u = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = l; i <= u; i++) {
            sum += i;
        }
        System.out.print("The sum is " + sum);
    }
}