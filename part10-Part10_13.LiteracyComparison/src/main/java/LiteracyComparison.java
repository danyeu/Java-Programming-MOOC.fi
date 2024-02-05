import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Statistic> stats = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("literacy.csv"))) {
            while (scanner.hasNextLine()) {
                stats.add(Statistic.fromString(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        stats.stream().sorted().forEach(System.out::println);

    }
}
