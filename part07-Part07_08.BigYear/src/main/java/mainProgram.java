
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String cmd = scan.nextLine();

            if (cmd.equals("Add")) {
                String name;
                String latin;
                while (true) {
                    System.out.print("Name: ");
                    name = scan.nextLine().trim();
                    System.out.print("Name in Latin: ");
                    latin = scan.nextLine().trim();
                    if (!name.isEmpty()) {
                        break;
                    }
                }
                for (Bird b: birds) {
                    if (b.getName().equals(name)) {
                        System.out.println("Bird already exists!");
                        continue;
                    }
                }
                birds.add(new Bird(name, latin));
            } else if (cmd.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                boolean birdObserved = false;
                for (Bird b: birds) {
                    if (b.getName().equals(name)) {
                        birdObserved = true;
                        b.observe();
                        break;
                    }
                }
                if (!birdObserved) {
                    System.out.println("Not a bird!");
                }
            } else if (cmd.equals("All")) {
                for (Bird b : birds) {
                    System.out.println(b);
                }
            } else if (cmd.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                for (Bird b: birds) {
                    if (b.getName().equals(name)) {
                        System.out.println(b);
                        break;
                    }
                }
            } else if (cmd.equals("Quit")) {
                return;
            }
        }

    }

}
