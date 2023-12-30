
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sumAges = 0;
        int ageCount = 0;
        while (true) {
            String s = scanner.nextLine();
            if (s.length() == 0) {
                break;
            }
            String[] l = s.split(",");
            ageCount ++;
            sumAges += Integer.parseInt(l[1]);
            if (l[0].length() > longestName.length()) {
                longestName = l[0];
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumAges) / ageCount);

    }
}
