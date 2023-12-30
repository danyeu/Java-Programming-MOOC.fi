
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if (s.length() == 0) {
                break;
            }
            String[] strings = s.split(" ");
            for (String i : strings) {
                if (i.contains("av")) {
                    System.out.println(i);
                }
            }
        }

    }
}
