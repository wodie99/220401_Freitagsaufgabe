import java.util.ArrayList;
import java.util.List;

public class OrderRepo {

    protected List<Order> orders;

    public OrderRepo() {
        orders = new ArrayList<Order>();
    }

    public void add(List<Product> newOrder) {
        Order order = new Order(newOrder);
        orders.add(order);
    }

    public void add(Product product) {
        Order order = new Order();
        order.add(product);
        orders.add(order);
    }

    public void list() {
        for (Order order: orders) {
            System.out.println(order);
        }
    }


}
