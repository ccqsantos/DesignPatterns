package structural_patterns.facade;

public class App {
    public static void main(String[] args) {
        var f = new Facade();
        f.startNewDay();
        f.endTheDay();
    }
}
