package creational_patterns.abstractfactory;

import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String type = args[0];

        playWith(type);
    }

    private static void playWith(String type) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        KingdomFactory factory = KingdomFactory
                .getInstance(type);

        createKingdom(factory);
    }

    private static void createKingdom(KingdomFactory factory) {
        Army army = factory.createArmy();
        Castle castle = factory.createCastle();
        King king = factory.createKing();

        System.out.println(army.getClass().getSimpleName());
        System.out.println(king.getClass().getSimpleName());
        System.out.println(castle.getClass().getSimpleName());

    }
}
