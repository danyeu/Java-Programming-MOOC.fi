
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if (s.length() == 0) {
                break;
            }
            String[] strings = s.split(" ");
            System.out.println(strings[strings.length - 1]);
        }

    }
}
