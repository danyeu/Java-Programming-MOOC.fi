
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String s = scanner.nextLine();
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
