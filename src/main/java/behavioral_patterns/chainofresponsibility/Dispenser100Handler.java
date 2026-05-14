package behavioral_patterns.chainofresponsibility;
import behavioral_patterns.chainofresponsibility.Currency;

public class Dispenser100Handler extends Handler{
    public Dispenser100Handler(Handler next) {
        super(next);
    }

    public void execute(Currency cur) {
        if (cur.getAmount() >= 100) {
            int num = cur.getAmount() / 100;
            System.out.println("Dispensing " + num + " of $50");
            int reminder = cur.getAmount() % 100;
            if (getNext() != null){
                getNext().execute(new behavioral_patterns.chainofresponsibility.Currency(reminder));
            }
        }else {
            if( getNext() != null){
                getNext().execute(cur);
            }
        }
    }
}
