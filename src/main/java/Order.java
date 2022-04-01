import java.util.ArrayList;
import java.util.List;

public class Order {
    public static int orderCounter = 1000;

    String orderId;
    List<Product> orderProducts;

    public Order() {
        orderId = "OR"+String.valueOf(orderCounter);
        Order.orderCounter++;
        orderProducts = new ArrayList<>();
    }

    public Order(List<Product> products) {
        orderId = "OR"+String.valueOf(orderCounter);
        Order.orderCounter++;
        orderProducts = products;
    }

    public void add(Product product) {
        orderProducts.add(product);
    }




    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderProducts=" + orderProducts +
                '}';
    }
}
