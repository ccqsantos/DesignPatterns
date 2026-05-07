package structural_patterns.facade;

import java.util.Arrays;

public abstract class Worker {
    public abstract String name();
    public abstract String work();

    enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_WORK, GO_HOME
    }

    public void action(Action action){
        switch (action){
            case GO_TO_SLEEP -> goToSleep();
            case WAKE_UP -> wakeUp();
            case GO_WORK -> System.out.println(name() + work());
            case GO_HOME -> goHome();
            default -> System.out.println("Undefined action");
        }
    }
    public void action(Action...actions){
        Arrays.stream(actions).forEach(this::action);
    }


    private void goToSleep() {
        System.out.println(name() + " dormindo");
    }

    private void wakeUp() {
        System.out.println(name() + " acordando");
    }

    private void goHome() {
        System.out.println(name() + " indo para casa");
    }
}

