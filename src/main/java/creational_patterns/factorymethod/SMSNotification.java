package creational_patterns.factorymethod;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification...");
    }
}
