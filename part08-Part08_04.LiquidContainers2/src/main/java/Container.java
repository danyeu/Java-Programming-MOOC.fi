public class Container {
    private int capacity;
    private int c;

    public Container() {
        this.capacity = 100;
        this.c = 0;
    }

    public int contains() {
        return c;
    }
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        c += amount;
        if (c > capacity) {
            c = capacity;
        }
    }
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        c -= amount;
        if (c < 0) {
            c = 0;
        }
    }
    public String toString() {
        return c + "/" + capacity;
    }
}
