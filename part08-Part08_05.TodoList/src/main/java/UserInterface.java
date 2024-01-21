import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;
    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String c = scanner.nextLine();
            if (c.equals("stop")) {
                return;
            } else if (c.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                if (task.isEmpty()) {
                    continue;
                }
                todo.add(task);
            } else if (c.equals("list")) {
                todo.print();
            } else if (c.equals("remove")) {
                System.out.print("Which one is removed? ");
                try {
                    int number = Integer.parseInt(scanner.nextLine());
                    todo.remove(number);
                } catch (Exception e) {}
            }
        }
    }
}
