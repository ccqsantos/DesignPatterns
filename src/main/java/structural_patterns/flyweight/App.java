package structural_patterns.flyweight;

public class App {
    public static void main(String[] args) {
        Widget clock = WidgetFactory.getWidget("clock");
        Widget clock2 = WidgetFactory.getWidget("clock");


        if(clock == clock2){
            System.out.println("São o mesmo objeto");
        }

        clock.draw("red", "left");
        clock2.draw("azul", "right");

    }
}
