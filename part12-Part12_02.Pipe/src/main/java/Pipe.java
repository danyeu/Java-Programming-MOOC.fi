import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> p;
    public Pipe() {
        this.p = new ArrayList<>();
    }
    public void putIntoPipe(T value) {
        p.add(value);
    }
    public T takeFromPipe() {
        if (!isInPipe()) {
            return null;
        }
        return p.remove(0);
    }

    public boolean isInPipe() {
        return !p.isEmpty();
    }
}
