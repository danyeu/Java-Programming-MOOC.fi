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
            String cmd = this.scanner.nextLine();
            if (cmd.equals("stop")) {
                return;
            }
            else if (cmd.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                this.todo.add(task);
            } else if (cmd.equals("list")) {
                this.todo.print();
            } else if (cmd.equals("remove")) {
                System.out.print("Which one is removed? ");
                String remove = this.scanner.nextLine();
                Integer removeInteger = Integer.parseInt(remove);
                this.todo.remove(removeInteger);
            }
        }
    }
}
