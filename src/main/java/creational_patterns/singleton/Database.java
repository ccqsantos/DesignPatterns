package creational_patterns.singleton;

public class Database{
    public static int counter = 0;

    private static Database db;

    private Database(){
        counter++;
    }

    public static Database getInstance() {
        if (db == null)
            db = new Database();

        return db;
    }
}
