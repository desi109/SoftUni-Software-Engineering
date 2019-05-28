import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if (age >= 0 && age <= 122) {
            if (day.equals("Weekday")) {
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                }
            }

            if (day.equals("Weekend")) {
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                }
            }

            if (day.equals("Holiday")) {
                if ((age >= 0 && age <= 18)) {
                    price = 5;
                } else if (age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122) {
                    price = 10;
                }
            }
            System.out.printf("%.0f$", price);
        } else {
            System.out.println("Error!");
        }


    }
}
