
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.

        String s1;
        String s2;
        System.out.println("Enter the first string:");
        s1 = scan.nextLine();
        System.out.println("Enter the second string:");
        s2 = scan.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
