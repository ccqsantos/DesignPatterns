package structural_patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws InterruptedException {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Marcador de quadro branco", 20.0));

        products.add(new Product(2, "Lápis 2B", 15.0));

        products.add(new Product(3, "Burracha", 14.7));

        products.add(new Product(4, "Janela", 34.99));

        ProductDAO dao = new ProductDAOProxy(products);

        dao.findAll();
        dao.findById(2);
        dao.save(new Product(5, "Tesoura", 22.4));
        Product seis = new Product(6, "Lapiseira", 44.5);
        dao.delete(seis);
    }
}
