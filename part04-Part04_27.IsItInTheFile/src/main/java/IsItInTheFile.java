import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean found = false;
        try (Scanner file_scanner = new Scanner(Paths.get(file))) {
            while (file_scanner.hasNextLine()) {
                String row = file_scanner.nextLine();
                if (row.contains(searchedFor)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }



    }
}