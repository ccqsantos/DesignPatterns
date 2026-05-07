package structural_patterns.facade;

import java.util.ArrayList;
import java.util.List;

public class Facade {
    private final List<Worker> workers;

    public Facade() {
        workers = new ArrayList<Worker>();
        workers.add(new Miner());
        workers.add(new Blacksmith());
    }

    public void startNewDay(){
        workers.forEach(w -> w.action(Worker.Action.WAKE_UP,
                Worker.Action.GO_WORK,
                Worker.Action.GO_HOME,
                Worker.Action.GO_TO_SLEEP));
    }

    public void endTheDay(){
        workers.forEach(w -> w.action(
                Worker.Action.GO_HOME,
                Worker.Action.GO_TO_SLEEP
        ));
    }
}
