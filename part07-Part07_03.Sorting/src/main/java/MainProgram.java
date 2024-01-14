import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int s = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
            }
        }
        return s;
    }

    public static int indexOfSmallest(int[] array){
        int x = 0;
        int s = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
                x = i;
            }
        }
        return x;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int x = startIndex;
        int s = array[x];
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
                x = i;
            }
        }
        return x;
    }

    public static void swap(int[] array, int index1, int index2) {
        int old = array[index1];
        array[index1] = array[index2];
        array[index2] = old;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = indexOfSmallestFrom(array, i);
            swap(array, i, index);
            System.out.println(Arrays.toString(array));
        }
    }
}
