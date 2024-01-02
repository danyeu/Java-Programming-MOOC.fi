import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (currentWeight() + suitcase.totalWeight() > this.maxWeight) {
            return;
        }
        this.suitcases.add(suitcase);
    }
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight() + " kg)";
    }

    public int currentWeight() {
        int w = 0;
        for (Suitcase s : suitcases) {
            w += s.totalWeight();
        }
        return w;
    }

    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }
}
