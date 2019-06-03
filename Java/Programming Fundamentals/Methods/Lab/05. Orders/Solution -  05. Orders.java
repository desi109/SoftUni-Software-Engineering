import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String food = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        price(food, n);
    }

    public static void price(String food, int n) {
        switch (food) {
            case "coffee":
                System.out.printf("%.2f", 1.50 * n);
                break;
            case "water":
                System.out.printf("%.2f", 1.00 * n);
                break;
            case "coke":
                System.out.printf("%.2f", 1.40 * n);
                break;
            case "snacks":
                System.out.printf("%.2f", 2.00 * n);
                break;
        }
    }


}


