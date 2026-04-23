package creational_patterns.prototype;

public class Person extends Prototype<Person> implements Cloneable {
    String name;
    Long document;

    public Person(String n, Long d) throws InterruptedException {
        name = n;
        document = d;

        Thread.sleep(3000);
        System.out.println("Demorano pra escrever...");
    }

    @Override
    public String toString() {
        return String.format("Person+(name: %s, document: %d)",
                name,
                document);
    }
}
