package behavioral_patterns.chainofresponsibility;
import behavioral_patterns.chainofresponsibility.Currency;

public class Dispenser20Handler extends Handler{
    public Dispenser20Handler(Handler next) {
        super(next);
    }

    public void execute(Currency cur) {
        if (cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            System.out.println("Dispensing " + num + " of $20");
            int reminder = cur.getAmount() % 20;
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
