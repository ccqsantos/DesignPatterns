package structural_patterns.proxy;

import jdk.jfr.StackTrace;

import java.util.List;

public class ProductDAOProxy extends ProductDAO{
    private long SLOW = 1000;

    public ProductDAOProxy(List<Product> products) {
        super(products);
    }

    @Override
    public List<Product> findAll() {
        //Registro de início:
        long reqStart = System.currentTimeMillis();
        
        //RealSubject -> Request
        var ret = super.findAll();

        logSlowQuery(reqStart);

        return ret;
    }

    @Override
    public Product findById(Integer id) throws InterruptedException {
        //Registro de início:
        long reqStart = System.currentTimeMillis();

        //RealSubject -> Request
        var ret = super.findById(id);

        logSlowQuery(reqStart);

        return ret;
    }

    @Override
    public void save(Product product) throws InterruptedException {
        //Registro de início:
        long reqStart = System.currentTimeMillis();

        //RealSubject -> Request
        super.save(product);

        logSlowQuery(reqStart);
    }

    @Override
    public void delete(Product product) throws InterruptedException {
        //Registro de início:
        long reqStart = System.currentTimeMillis();

        //RealSubject -> Request
        super.delete(product);

        logSlowQuery(reqStart);
    }

    private void logSlowQuery(long reqStart) {
        long timeElapsed = System.currentTimeMillis() - reqStart;

        StackTraceElement frame = Thread.getAllStackTraces().get(Thread.currentThread())[3];

        if(timeElapsed >= SLOW){
            System.out.printf("Method %s took too much time to execute.\nTimelapsed: %d ms\n", frame.getClassName()+"."+frame.getMethodName(), timeElapsed);
        }
    }
}
