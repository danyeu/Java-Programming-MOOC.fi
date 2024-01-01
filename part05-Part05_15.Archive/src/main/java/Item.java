public class Item {
    private String name;
    private String id;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return this.id + ": " +this.name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }
        Item c = (Item) compared;
        if (!this.id.equals(c.id)) {
            return false;
        }
        return true;
    }
}
