import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> set = new TreeSet<>();

        while (n-- > 0) {
            String[] line  = scanner.nextLine().split("\\s+");
            set.addAll(Arrays.asList(line));
        }
        
        set.forEach(e -> System.out.print(e + " "));


    }
}


