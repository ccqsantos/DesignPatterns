package behavioral_patterns.chainofresponsibility;
import behavioral_patterns.chainofresponsibility.Currency;

public class Dispenser1Handler extends Handler{
    public Dispenser1Handler(Handler next) {
        super(next);
    }

    public void execute(Currency cur) {
        if (cur.getAmount() >= 1) {
            int num = cur.getAmount() / 1;
            System.out.println("Dispensing " + num + " of $1");
            int reminder = cur.getAmount() % 1;
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
