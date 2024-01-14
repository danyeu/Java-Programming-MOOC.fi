import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        Nums numbers = new Nums();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            try {
                Integer i = Integer.parseInt(scanner.nextLine());
                if (i == -1) {
                    break;
                }
                numbers.add(i);
            } catch (Exception e) {}
        }

        String s = "Point average (all): ";
        try {
            System.out.println(s + numbers.avg());
        } catch (Exception e) {
            System.out.println(s + "-");
        }

        s = "Point average (passing): ";
        try {
            System.out.println(s + numbers.avgPassing());
        } catch (Exception e) {
            System.out.println(s + "-");
        }

        System.out.println("Pass percentage: " + numbers.passPercentage());
        numbers.printDistribution();
    }



}
