import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers,1, 2, null, 2, null);

        List<Integer> integerNulls = (List<Integer>) ListUtils.getNullIndices(integers);
        System.out.println(integerNulls);


        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", null, "c");

        Iterable<Integer> stringNulls = ListUtils.getNullIndices(strings);
        System.out.println(stringNulls);
    }
}


