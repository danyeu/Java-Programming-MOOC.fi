
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c1 = 0;
        int c2 = 0;
        System.out.println("First: " + c1 + "/100");
        System.out.println("Second: " + c2 + "/100");
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                return;
            } else if (input.startsWith("add")) {
                int amount = Integer.parseInt(input.split(" ")[1]);
                if (amount > 0) {
                    c1 += amount;
                    if (c1 > 100) {
                        c1 = 100;
                    }
                }

            } else if (input.startsWith("move")) {
                int amount = Integer.parseInt(input.split(" ")[1]);
                if (amount > 0) {
                    if (amount > c1) {
                        amount = c1;
                    }
                    c1 -= amount;
                    c2 += amount;
                    if (c2 > 100) {
                        c2 = 100;
                    }
                }
            } else if (input.startsWith("remove")) {
                int amount = Integer.parseInt(input.split(" ")[1]);
                if (amount > 0) {
                    if (amount > c2) {
                        amount = c2;
                    }
                    c2 -= amount;
                }
            }
            System.out.println("First: " + c1 + "/100");
            System.out.println("Second: " + c2 + "/100");

        }
    }

}
