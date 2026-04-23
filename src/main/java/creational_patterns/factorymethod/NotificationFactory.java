package creational_patterns.factorymethod;
import creational_patterns.factorymethod.Notification.Type;

public class NotificationFactory {
    /**
     * Este é um método responsável por abstrair a complexidade
     * da construção de objetos e classes.
     * @param type tipo de notificação
     * @return Objeto dispara a notificação esperada
     */
    public static Notification create(Type type){
        switch (type) {
            case EMAIL : return new EmailNotification();
            case SMS : return new SMSNotification();
            case PUSH: return new PushNotification();
            default: throw new IllegalArgumentException("Unknown notification type");
        }
    }
}
