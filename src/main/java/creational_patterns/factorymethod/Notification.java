package creational_patterns.factorymethod;

public interface Notification {
    enum Type {
        SMS, EMAIL, PUSH
    }

    public void notifyUser();

}
