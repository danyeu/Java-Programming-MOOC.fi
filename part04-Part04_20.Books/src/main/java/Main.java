import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            Integer pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication year: ");
            Integer year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String info = scanner.nextLine();

        for (Book b : books) {
            if (info.equals("everything")) {
                System.out.println(b.toString());;
            }
            else if (info.equals("name")) {
                System.out.println(b.getTitle());
            }
        }

    }
}
