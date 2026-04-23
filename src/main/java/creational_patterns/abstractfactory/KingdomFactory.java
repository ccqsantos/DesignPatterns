package creational_patterns.abstractfactory;

import java.lang.reflect.InvocationTargetException;

public interface KingdomFactory {
    public King createKing();

    public Castle createCastle();

    public Army createArmy();

    public static KingdomFactory getInstance(String type) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //type = "Elf"
        //class = "abstract.ElfKingdom"
        //class = "abstract." + type + "Kingdom"
        type = "abstractfactory." + type + "Kingdom";
        KingdomFactory f = null;

        try {
            f = (KingdomFactory) Class.forName(type)
                    .getDeclaredConstructor()
                    .newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException |
                 InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return f;
    }


}
