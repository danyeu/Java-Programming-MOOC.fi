

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("adam");
        Student second = new Student("bob");
        System.out.println(first.compareTo(second));
    }
}
