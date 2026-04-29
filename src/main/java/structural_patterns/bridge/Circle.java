package structural_patterns.bridge;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "drawing a circle " + color.fill();
    }
}
