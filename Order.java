import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int orderId;
    private int customerId;
    private ArrayList<Product> products;
    private double totalPrice;
    private Date orderDate;

    public Order(int orderId, int customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
        this.orderDate = new Date(); // Current date and time
    }
    
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();
    }
    public void removeProduct(Product product) {
        products.remove(product);
        totalPrice -= product.getPrice();
    }
    public double getTotalPrice() {
        return totalPrice;
    }


    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

}
