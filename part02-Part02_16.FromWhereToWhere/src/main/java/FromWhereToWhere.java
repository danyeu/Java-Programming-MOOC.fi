
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int u = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from? ");
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = l; i <= u; i++) {
            System.out.println(i);
        }


    }
}
