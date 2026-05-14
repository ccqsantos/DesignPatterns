package behavioral_patterns.chainofresponsibility;
import java.util.Scanner;
import behavioral_patterns.chainofresponsibility.Currency;

public class App {
    public static void main(String[] args) {

        Handler first = getChain();
        Scanner sc = new Scanner(System.in);
        int amount = 0;
        do {
            System.out.print("Quantos dinheiros vc quer? :3 (0 para sair): ");
            amount = sc.nextInt();
            if (amount > 0) first.execute(new Currency(amount));
        }while (amount > 0);
        sc.close();
    }

    private static Handler getChain(){
        return new Dispenser50Handler(
                new Dispenser20Handler(
                        new Dispenser1Handler(null)
                )
        );
    }
}
