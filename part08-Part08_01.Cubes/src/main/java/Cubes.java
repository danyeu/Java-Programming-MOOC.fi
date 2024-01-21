
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.trim().equals("end")) {
                return;
            }
            Integer i = Integer.parseInt(s);
            System.out.println(i * i * i);
        }
    }
}
