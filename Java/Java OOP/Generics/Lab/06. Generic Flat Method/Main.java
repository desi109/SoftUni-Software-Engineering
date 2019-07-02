import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers,1, 2, 3);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles,1.2, 3.2);

        List<List<? extends  Number>> jagged = new ArrayList<>();

        List<Number> dest = new ArrayList<>();
        ListUtils.flatten(dest, jagged);

    }
}
