package creational_patterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        Notification p = NotificationFactory.create(Notification.Type.PUSH);
        Notification s = NotificationFactory.create(Notification.Type.SMS);
        Notification e = NotificationFactory.create(Notification.Type.EMAIL);
    }
}
