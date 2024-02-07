
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());
            books.add(new Book(name, age));
            System.out.println();
        }

        System.out.println(books.size() + " books in total.\n");
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator.comparing(Book::age).thenComparing(Book::name);
        Collections.sort(books,comparator);
        books.stream().forEach(System.out::println);
    }

}
