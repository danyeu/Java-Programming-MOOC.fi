
import java.util.List;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String u = scanner.nextLine();
        System.out.print("Enter password: ");
        String p = scanner.nextLine();
        boolean ok = true;

        if (u.equals("alex")) {
            if (!p.equals("sunshine")) {
                ok = false;
            }
        } else if (u.equals("emma")) {
            if (!p.equals("haskell")) {
                ok = false;
            }
        } else {
            ok = false;
        }

        if (ok) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
