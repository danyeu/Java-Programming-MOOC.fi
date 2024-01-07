public class Container {
    private int amount;
    private int limit;

    public Container() {
        this.amount = 0;
        this.limit = 100;
    }

    public int contains() {
        return this.amount;
    }
    public  void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount += amount;
        if (this.amount > this.limit) {
            this.amount = this.limit;
        }
    }
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount -= amount;
        if (this.amount < 0) {
            this.amount = 0;
        }
    }
    public String toString() {
        return contains() + "/" + limit;
    }
}
