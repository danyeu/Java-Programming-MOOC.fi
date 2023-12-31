
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String f = scanner.nextLine();
        try (Scanner fscan = new Scanner(Paths.get(f))) {
            while (fscan.hasNextLine()) {
                String row = fscan.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                String[] details = row.split(",");
                String name = details[0];
                Integer age = Integer.parseInt(details[1]);
                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
