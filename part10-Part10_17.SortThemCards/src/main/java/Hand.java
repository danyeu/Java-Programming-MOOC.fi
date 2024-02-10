import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    public Hand() {
        this.cards = new ArrayList<>();
    }
    public void add(Card card) {
        cards.add(card);
    }
    public void print() {
        cards.forEach(System.out::println);
    }
    public void sort() {
        cards.sort(Card::compareTo);
    }

    public int sumValues() {
        return cards.stream().map(Card::getValue).reduce(0, Integer::sum);
    }

    @Override
    public int compareTo(Hand h) {
        return sumValues() - h.sumValues();
    }

    public void sortBySuit() {
        cards.sort(new BySuitInValueOrder());
    }
}
