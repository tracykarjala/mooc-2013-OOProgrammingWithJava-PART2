import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }

    public void add(String product, int price) {
        Purchase item = new Purchase(product, 1, price);
        for (Purchase purchase: purchases) {
            if (purchase.equals(item)) {
                purchase.increaseAmount();
                return;
            }
        }
        purchases.add(item);
    }

    public int price() {
        int totalPrice = 0;
        for (Purchase purchase : purchases) {
            totalPrice += purchase.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        }
    }
}
