
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Give the first number:");
        n1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        n2 = Integer.parseInt(scan.nextLine());

        if (n1 > n2) {
            System.out.println("Greater number is: " + n1);
        } else if (n2 > n1) {
            System.out.println("Greater number is: " + n2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
