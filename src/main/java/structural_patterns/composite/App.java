package structural_patterns.composite;

public class App {
    public static void main(String[] args) {
        CompositeDepartment clevel = new CompositeDepartment("C-Level");

        CompositeDepartment tech = new CompositeDepartment("Technology");
        CompositeDepartment hr = new CompositeDepartment("Human Resources");
        CompositeDepartment mkt = new CompositeDepartment("Marketing");

        clevel.add(tech).add(hr).add(mkt);

        tech.add(new Department("Software Engineer"))
                .add(new Department("Data Science"));

        mkt.add(new Department("UX Design"));

        clevel.print();
    }
}
