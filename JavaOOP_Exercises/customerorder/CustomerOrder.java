package customerorder;

public class CustomerOrder {
    int orderID;
    String customer;
    String orderDate;

    public CustomerOrder(int orderID, String customer, String orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
    }
}
