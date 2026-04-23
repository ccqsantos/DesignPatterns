package creational_patterns.prototype;
import java.lang.Cloneable;

public class Prototype<T extends Cloneable> {
    public T copy() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}
