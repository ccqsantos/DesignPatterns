package behavioral_patterns.chainofresponsibility;
import behavioral_patterns.chainofresponsibility.Currency;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next){
        this.next = next;
    }

    public Handler getNext(){
        return next;
    }

    public abstract void execute(Currency cur);

}
