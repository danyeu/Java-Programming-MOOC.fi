import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashCodes = new HashMap<>();
        int counter = 0;
        for (int day = 1; day <= 31; day++) {
            for (int month = 1; month <= 12; month++) {
                for (int year = 1900; year <= 2100; year++) {
                    counter++;
                    SimpleDate date = new SimpleDate(day,month,year);
                    hashCodes.put(date.hashCode(), 0);
                }
            }
        }
        if (counter != hashCodes.size()) {
            System.out.println("DUPLICATE HASHCODES");
        }
    }
}
