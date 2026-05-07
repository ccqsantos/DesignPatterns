package structural_patterns.facade;

public class Miner extends Worker{

    @Override
    public String name() {
        return "Miner";
    }

    @Override
    public String work() {
        return name() + " works digging to find metal...";
    }
}
