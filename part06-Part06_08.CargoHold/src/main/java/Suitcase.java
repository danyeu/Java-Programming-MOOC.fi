import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }



    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() > this.maxWeight) {
            return;
        }
        this.items.add(item);
    }

    public int totalWeight() {
        int w = 0;
        for (Item i : items) {
            w += i.getWeight();
        }
        return w;
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0kg)";
        }
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + totalWeight() + " kg)";
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        int maxWeight = 0;
        Item heaviest = this.items.get(0);
        for (Item i : items) {
            if (i.getWeight() > maxWeight) {
                maxWeight = i.getWeight();
                heaviest = i;
            }
        }
        return heaviest;

    }


}
