import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> price;
    private Map<String, Integer> stock;

    public Storehouse() {
        this.price = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }

    public void addProduct(String name, int price, int stock) {
        this.price.put(name, price);
        this.stock.put(name, stock);
    }

    public int price(String name) {
        if (!price.containsKey(name)) {
            return -99;
        }
        return price.get(name);
    }

    public int stock(String name) {
        if (!stock.containsKey(name)) {
            return 0;
        }
        return stock.get(name);
    }

    public boolean take(String product) {
        int inStock = stock(product);
        if (!stock.containsKey(product) || inStock == 0) {
            return false;
        }
        stock.replace(product, stock(product), stock(product) - 1);
        return true;
    }

    public Set<String> products() {
        Set<String> products = new HashSet<String>();
        for (String product : price.keySet()) {
            products.add(product);
        }
        return products;
    }
}
