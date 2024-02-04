import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> movables;
    public Herd() {
        this.movables = new ArrayList<>();
    }

    public String toString() {
        String s = "";
        for (Movable m : movables) {
            s += "\n" + m;
        }
        return s.replaceFirst("\n","");
    }
    public void addToHerd(Movable movable) {
        this.movables.add(movable);
    }
    public void move(int dx, int dy) {
        for (Movable m : movables) {
            m.move(dx, dy);
        }
    }
}
