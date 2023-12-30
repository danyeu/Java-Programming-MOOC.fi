
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        while (true) {
            String s = scanner.nextLine();
            if (s.length() == 0) {
                break;
            }
            String[] l = s.split(",");
            if (Integer.parseInt(l[1]) > maxAge) {
                maxAge = Integer.parseInt(l[1]);
            }
        }
        System.out.println("Age of the oldest: " + maxAge);
    }
}
