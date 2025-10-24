package inventory;

public class InventoryMain {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Product p1 = new Product("Laptop", 3);
        inv.addProduct(p1);
        inv.checkLowInventory(5);
    }
}
