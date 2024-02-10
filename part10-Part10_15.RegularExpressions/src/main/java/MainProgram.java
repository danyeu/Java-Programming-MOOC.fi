import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checker = new Checker();

        String tue = "tue";
        String abc = "abc";
        System.out.println(checker.isDayOfWeek(tue));
        System.out.println(checker.isDayOfWeek(abc));

        String oi = "oi";
        String queue = "queue";
        System.out.println(checker.allVowels(oi));
        System.out.println(checker.allVowels(queue));

        String time = "17:23:05";
        String time2 = "33:33:33";
        System.out.println(checker.timeOfDay(time));
        System.out.println(checker.timeOfDay(time2));
        System.out.println(checker.timeOfDay(abc));
    }
}
