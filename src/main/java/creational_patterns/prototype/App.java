package creational_patterns.prototype;

public class App {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Person p1 = new Person("João", 987563L);
        System.out.println(p1);

        Person p2 = (Person) p1.copy();
        p2.name = "Pedro";
        p2.document = 30433424L;
        System.out.println(p2);

        Person p3 = (Person) p2.copy();
        p3.name = "Karina";
        p3.document = 3259240L;
        System.out.println(p3);
    }
}
