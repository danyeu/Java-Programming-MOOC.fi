
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(-1);
        ints.add(-2);
        ints.add(42);
        ints.add(-232);
        System.out.println(positive(ints));


    }
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(i -> i > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
