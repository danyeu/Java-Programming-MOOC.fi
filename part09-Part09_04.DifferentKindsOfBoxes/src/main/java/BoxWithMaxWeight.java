import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int current = 0;
        if (!items.isEmpty()) {
            for (Item i : items) {
                current += i.getWeight();
            }
        }
        if (item.getWeight() + current <= capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item i : items) {
            if (i.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
