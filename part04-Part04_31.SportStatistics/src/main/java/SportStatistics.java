
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        try (Scanner fscan = new Scanner(Paths.get(file))) {
            Integer teamCount = 0;
            Integer wins = 0;
            Integer losses = 0;

            while (fscan.hasNextLine()) {
                String row = fscan.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                String[] details = row.split(",");
                String team1 = details[0];
                String team2 = details[1];
                Integer points1 = Integer.parseInt(details[2]);
                Integer points2 = Integer.parseInt(details[3]);


                if (team1.equals(team)) {
                    teamCount += 1;
                    if (points1 > points2) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                } else if (team2.equals(team)) {
                    teamCount += 1;
                    if (points1 > points2) {
                        losses += 1;
                    } else {
                        wins += 1;
                    }
                }

            }

            System.out.println("Games: " + teamCount);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
