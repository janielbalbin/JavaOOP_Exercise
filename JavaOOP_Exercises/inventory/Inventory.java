package inventory;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) { products.add(p); }
    public void removeProduct(Product p) { products.remove(p); }
    public void checkLowInventory(int limit) {
        for (Product p : products) {
            if (p.quantity < limit)
                System.out.println(p.name + " is low in stock.");
        }
    }
}
