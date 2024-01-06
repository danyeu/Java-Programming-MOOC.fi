import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    public TodoList() {
        this.list = new ArrayList<>();
    }
    public void add(String task) {
        this.list.add(task);
    }
    public void print() {
        if (this.list.isEmpty()) {
            return;
        }
        for (int i = 1; i <= this.list.size(); i++) {
            System.out.println(i + ": " + this.list.get(i - 1));
        }
    }
    public void remove(int number) {
        if (number <= 0 | number > this.list.size()) {
            return;
        }
        this.list.remove(number - 1);
    }
}
