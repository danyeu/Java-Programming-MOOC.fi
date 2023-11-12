
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i<= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        int baseLayerWidth = (2 * height) - 1;

        for (int h = 1; h <= height; h++) {
            int currentLayerWidth = (2 * h) - 1;
            int currentSpacesToPrint = (baseLayerWidth / 2) + 1 - h;
            printSpaces(currentSpacesToPrint);
            printStars(currentLayerWidth);
        }

        // base
        int baseSpacesToPrint = (((2 * height) - 1) - 3) / 2;
        for (int i = 0; i < 2; i++) {
            printSpaces(baseSpacesToPrint);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
