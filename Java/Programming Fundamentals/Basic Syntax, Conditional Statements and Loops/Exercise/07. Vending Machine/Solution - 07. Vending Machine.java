import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coinsInput = "";
        double sum = 0.0;

        while (!"Start".equals(coinsInput = scanner.nextLine())) {
            if (coinsInput.equals("0.1") ||
                    coinsInput.equals("0.2") ||
                    coinsInput.equals("0.5") ||
                    coinsInput.equals("1") ||
                    coinsInput.equals("2") ||
                    coinsInput.equals("0.50")
                    ) {
                sum += Double.parseDouble(coinsInput);
            } else {
                System.out.printf("Cannot accept %.2f\n",
                        Double.parseDouble(coinsInput));
            }
        }

        String productInput = scanner.nextLine();

        while (!"End".equals((productInput))) {

            switch (productInput) {
                case "Nuts":
                    if (sum >= 2.0) {
                        sum -= 2.0;
                        System.out.printf("Purchased %s\n", productInput);
                    } else {
                        System.out.printf("Sorry, not enough money\n");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        sum -= 0.7;
                        System.out.printf("Purchased %s\n", productInput);
                    } else {
                        System.out.printf("Sorry, not enough money\n");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.printf("Purchased %s\n", productInput);
                    } else {
                        System.out.printf("Sorry, not enough money\n");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        sum -= 0.8;
                        System.out.printf("Purchased %s\n", productInput);
                    } else {
                        System.out.printf("Sorry, not enough money\n");
                    }
                    break;
                case "Coke":
                    if (sum >= 1.0) {
                        sum -= 1.0;
                        System.out.printf("Purchased %s\n", productInput);
                    } else {
                        System.out.printf("Sorry, not enough money\n");
                    }
                    break;
                default:
                    System.out.printf("Invalid product\n");
                    break;
            }

            productInput = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}





