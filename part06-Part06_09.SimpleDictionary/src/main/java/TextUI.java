import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                return;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                this.dict.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = this.scanner.nextLine();
                String translated = this.dict.translate(word);
                if (translated == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + translated);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
