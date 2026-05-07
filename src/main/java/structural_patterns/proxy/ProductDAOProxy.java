package structural_patterns.proxy;

import java.util.List;

public class ProductDAOProxy extends ProductDAO{

    public ProductDAOProxy(List<Product> products) {
        super(products);
    }

    @Override
    public List<Product> findAll() {
        return super.findAll();
    }

    @Override
    public Product findById(Integer id) throws InterruptedException {
        return super.findById(id);
    }

    @Override
    public void save(Product product) throws InterruptedException {
        super.save(product);
    }

    @Override
    public void delete(Product product) throws InterruptedException {
        super.delete(product);
    }
}
