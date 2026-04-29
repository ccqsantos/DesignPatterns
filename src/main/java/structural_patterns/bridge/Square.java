package structural_patterns.bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "drawing a square " + color.fill();
    }
}
