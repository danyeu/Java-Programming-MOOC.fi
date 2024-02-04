import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
            return;
        }
        cart.put(product, new Item(product, 1, price));
    }

    public int price() {
        int p = 0;
        for (Item i : cart.values()) {
            p += i.price();
        }
        return p;
    }

    public void print() {
        for (Item i : cart.values()) {
            System.out.println(i);
        }
    }
}
