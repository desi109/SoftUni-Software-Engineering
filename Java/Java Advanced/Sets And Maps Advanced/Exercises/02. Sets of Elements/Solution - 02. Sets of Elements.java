import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        Set<Integer> setN = new LinkedHashSet<>();
        Set<Integer> setM = new LinkedHashSet<>();

        while (n-- > 0) {
            setN.add(Integer.parseInt(scanner.nextLine()));
        }

        while (m-- > 0) {
            setM.add(Integer.parseInt(scanner.nextLine()));
        }

        setN.retainAll(setM);
        setN.forEach(e -> System.out.print(e + " "));


    }
}


