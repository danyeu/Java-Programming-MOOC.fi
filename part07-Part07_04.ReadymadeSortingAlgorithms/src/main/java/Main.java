import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] s = {"a","g","b","e","aa"};
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(4);
        l1.add(3);
        l1.add(1);
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("q");
        l2.add("a");
        l2.add("b");

        sort(array);
        sort(s);
        sortIntegers(l1);
        sortStrings(l2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(s));
        System.out.println(l1);
        System.out.println(l2);
    }
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
