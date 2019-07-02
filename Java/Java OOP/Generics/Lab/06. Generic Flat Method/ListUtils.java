import java.util.List;

public class ListUtils<T> {

    public static <T> void flatten(List<? super T> dest, List<List<? extends T>> source)  {

        for (List<? extends T> inner: source) {
            dest.addAll(inner);
        }
    }
}
