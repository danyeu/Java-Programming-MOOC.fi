import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        for (String p : this.prices.keySet()) {
            if (product.equals(p)) {
                return this.prices.get(p);
            }
        }
        return -99;
    }

    public int stock(String product) {
        for (String p : this.stock.keySet()) {
            if (product.equals(p)) {
                return this.stock.get(p);
            }
        }
        return 0;
    }

    public int getUnitPrice(String product) {
        return prices.getOrDefault(product, -99);
    }

    public boolean take(String product) {
        if (this.stock.getOrDefault(product, 0) < 1) {
            return false;
        }
        this.stock.put(product, this.stock.get(product) - 1);
        return true;
    }

    public Set<String> products() {
        return this.stock.keySet();
    }
}
