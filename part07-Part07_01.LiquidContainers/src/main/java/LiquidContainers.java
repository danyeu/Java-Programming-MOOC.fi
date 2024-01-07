
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int c1 = 0;
        int c2 = 0;
        int c1Limit = 100;
        int c2Limit = 100;


        while (true) {
            System.out.println("First: " + c1 + "/"+c1Limit);
            System.out.println("Second: " + c2 + "/"+c2Limit);

            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            } else if (input.startsWith("add ") & input.length() > 4) {
                Integer add = 0;
                try {
                    add = Integer.parseInt(input.substring(4));
                } catch (Exception e) {
                    continue;
                }
                if (add < 0) {
                    continue;
                }
                if (c1 == c1Limit) {
                    c2 += add;
                } else {
                    c1 += add;
                }

                if (c1 > c1Limit) {
                    c1 = c1Limit;
                }
                if (c2 > c2Limit) {
                    c2 = c2Limit;
                }
            } else if (input.startsWith("move ") & input.length() > 5) {
                Integer move = 0;
                try {
                    move = Integer.parseInt(input.substring(5));
                } catch (Exception e) {
                    continue;
                }
                if (move < 0) {
                    continue;
                }
                if (move > c1) {
                    move = c1;
                }
                c1 -= move;
                c2 += move;
                if (c2 > c2Limit) {
                    c2 = c2Limit;
                }
            } else if (input.startsWith("remove ") & input.length() > 7) {
                Integer remove = 0;
                try {
                    remove = Integer.parseInt(input.substring(7));
                } catch (Exception e) {
                    continue;
                }
                if (remove < 0) {
                    continue;
                }
                if (remove > c2) {
                    remove = c2;
                }
                c2 -= remove;
            }

        }
    }

}
