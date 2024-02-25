
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("How many random numbers should be printed?");
        int nums = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nums; i++) {
            System.out.println(r.nextInt(11));
        }
    }

}
