import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i<= 2; i++){
            numbers.add(Integer.parseInt(scanner.nextLine()));
        }

        Collections.sort(numbers);
        for (int i = 2; i >= 0 ; i--) {
            System.out.println(numbers.get(i));
        }
    }
}
