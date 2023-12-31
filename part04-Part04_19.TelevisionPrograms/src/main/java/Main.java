import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            Integer duration = Integer.parseInt(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));
        }
        System.out.print("Program's maximum duration? ");
        Integer max = Integer.parseInt(scanner.nextLine());
        for (TelevisionProgram p : programs) {
            if (p.getDuration() <= max) {
                System.out.println(p.toString());
            }
        }
    }
}
