import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMin(List<T> list) throws IllegalAccessException {
        if (list.isEmpty()) {
            throw new IllegalAccessException("Empty list!");
        }
        T min = list.get(0);
        for (T t : list) {
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }
        return min;
    }


    public static <T extends Comparable<T>> T getMax(List<T> list) throws IllegalAccessException {
        if (list.isEmpty()) {
            throw new IllegalAccessException("Empty list!");
        }
        T max = list.get(0);
        for (T t : list) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
}
