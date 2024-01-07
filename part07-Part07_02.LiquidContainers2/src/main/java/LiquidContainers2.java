
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container();
        Container c2 = new Container();

        while (true) {
            System.out.println("First: " + c1);
            System.out.println("Second: " + c2);
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
                if (c1.contains() == 100) {
                    c2.add(add);
                } else {
                    c1.add(add);
                }
            } else if (input.startsWith("move ") & input.length() > 5) {
                Integer move = 0;
                try {
                    move = Integer.parseInt(input.substring(5));
                } catch (Exception e) {
                    continue;
                }
                if (c1.contains() < move) {
                    move = c1.contains();
                }
                c1.remove(move);
                c2.add(move);
            } else if (input.startsWith("remove ") & input.length() > 7) {
                Integer remove = 0;
                try {
                    remove = Integer.parseInt(input.substring(7));
                } catch (Exception e) {
                    continue;
                }
                c2.remove(remove);
            }
        }
    }
}
