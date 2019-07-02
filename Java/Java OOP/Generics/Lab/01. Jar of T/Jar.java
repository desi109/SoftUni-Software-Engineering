import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> items;

    //Constructor
    public Jar() {
        this.items = new ArrayDeque<T>();
    }

    public void add(T element) {
        this.items.add(element);
    }

    public T remove() {
        return this.items.pop();
    }
}
