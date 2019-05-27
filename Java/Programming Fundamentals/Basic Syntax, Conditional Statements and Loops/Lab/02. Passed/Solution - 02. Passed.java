import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        while (grade < 2 || grade > 6) {
            grade = Double.parseDouble(scanner.nextLine());
        }

        if (grade > 3) {
            System.out.println("Passed!");
        } else {
            System.out.println("(no output)");
        }
    }
}
