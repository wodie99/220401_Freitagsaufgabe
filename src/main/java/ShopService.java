import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopService {

    protected ProductRepo productRepo;
    protected OrderRepo orderRepo;

    public ShopService() {
        productRepo = new ProductRepo();
        orderRepo = new OrderRepo();
        initProductRepo();
    }

    public void initProductRepo() {
        Product product1 = new Product("PR001", "1000 Blatt Schreibpapier Din A4");
        Product product2 = new Product("PR002", "500 Blatt Schreibpapier Din A5");
        Product product3 = new Product("PR003", "1kg Büroklammern");

        productRepo.add(product1);
        productRepo.add(product2);
        productRepo.add(product3);
    }

    public void listProducts() {
        productRepo.list();
    }

    public void printProduct(String id) {
        System.out.println(productRepo.get(id));
    }

    public Product getProduct(String id) {
        return productRepo.get(id);
    }

    public void addOrder(Product product) {
        orderRepo.add(product);

    }

    public void addOrder() {
        List<Product> newOrder = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Für Bestellung bitte ProduktID eingeben / Ende mit XXX");
        String input = scanner.nextLine();
        while (!input.equals("XXX")) {
            if (getProduct(input) == null) {
                System.out.println("Dies war keine gültige ProduktID!");
            } else {
                newOrder.add(getProduct(input));
            }
            System.out.println("für weitere Produkte in der selben Bestellung bitte ProduktID eingeben / Ende mit XXX");
            input = scanner.nextLine();
        }
        orderRepo.add(newOrder);
    }

    public void listOrders() {
        orderRepo.list();
    }



}
