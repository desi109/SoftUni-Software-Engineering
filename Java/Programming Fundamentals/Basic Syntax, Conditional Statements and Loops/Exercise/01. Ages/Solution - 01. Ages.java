import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 0 && age <= 2)
            System.out.print("baby");
        else if (age >= 3 && age <= 13)
            System.out.print("child");
        else if (age >= 14 && age <= 19)
            System.out.print("teenager");
        else if (age >= 20 && age <= 65)
            System.out.print("adult");
        else if (age >= 66)
            System.out.print("elder");


    }
}
