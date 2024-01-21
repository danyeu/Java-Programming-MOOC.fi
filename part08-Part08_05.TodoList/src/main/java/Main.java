
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TodoList todo = new TodoList();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(todo, scanner);
        ui.start();

    }
}
