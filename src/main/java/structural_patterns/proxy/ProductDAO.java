package structural_patterns.proxy;

import java.util.List;
import java.util.Random;

public class ProductDAO {
    public List<Product> products;

    //Constructor
    public ProductDAO(List<Product> products) {
        this.products = products;
    }

    //Methods
    public List<Product> findAll(){
        return this.products;
    }

    public Product findById(Integer id) throws InterruptedException{
        simulateDelay();
        return this.products.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void save(Product product) throws InterruptedException {
        simulateDelay();
        this.products.add(product);
    }

    public void delete(Product product) throws InterruptedException {
        simulateDelay();
        this.products.remove(product);
    }

    public void simulateDelay() throws InterruptedException {
        Random r = new Random();
        Thread.sleep(r.nextInt(6000));
    }
}
