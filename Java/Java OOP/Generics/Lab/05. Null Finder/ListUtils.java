import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListUtils {

    public static Iterable<Integer> getNullIndices(List<?> list)  {

        Collection<Integer> nulls = new ArrayList<>();

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) == null){
                nulls.add(i);
            }
        }

        return nulls;
    }
}
