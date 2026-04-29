package structural_patterns.bridge;

public class App {
    public static void main(String[] args) {
        Shape RedCircle = new Circle(new Red());
        System.out.println(RedCircle.draw());
    }
}
