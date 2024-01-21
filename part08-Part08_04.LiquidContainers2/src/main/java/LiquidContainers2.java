
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container();
        Container c2 = new Container();
        System.out.println("First: " + c1);
        System.out.println("Second: " + c2);

        while (true) {
            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                return;
            } else if (input.startsWith("add")) {
                int amount = Integer.parseInt(input.split(" ")[1]);
                c1.add(amount);
            } else if (input.startsWith("move")) {
                int amount = Integer.parseInt(input.split(" ")[1]);
                if (amount > c1.contains()) {
                    amount = c1.contains();
                }
                c1.remove(amount);
                c2.add(amount);
            } else if (input.startsWith("remove")) {
                int amount = Integer.parseInt(input.split(" ")[1]);
                c2.remove(amount);
            }
            System.out.println("First: " + c1);
            System.out.println("Second: " + c2);

        }
    }

}
