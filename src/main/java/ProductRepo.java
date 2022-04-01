import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    protected List<Product> products;



    public ProductRepo() {
        products = new ArrayList<Product>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void list() {
        for (Product product: products) {
            System.out.println(product);
        }

    }

    public Product get(String id) {
        for (Product product: products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;

    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
