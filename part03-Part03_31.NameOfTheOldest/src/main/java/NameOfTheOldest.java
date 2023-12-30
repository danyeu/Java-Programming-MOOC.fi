
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        String maxName = "";
        while (true) {
            String s = scanner.nextLine();
            if (s.length() == 0) {
                break;
            }
            String[] l = s.split(",");
            if (Integer.parseInt(l[1]) > maxAge) {
                maxAge = Integer.parseInt(l[1]);
                maxName = l[0];
            }
        }
        System.out.println("Name of the oldest: " + maxName);

    }
}
