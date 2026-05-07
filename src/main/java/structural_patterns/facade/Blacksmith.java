package structural_patterns.facade;

public class Blacksmith extends Worker{

    @Override
    public String name() {
        return "Blacksmith";
    }

    @Override
    public String work() {
        return name() + " works creating tools...";
    }
}
