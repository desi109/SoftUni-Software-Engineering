import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "%([A-Z][a-z]+)%[^|$%.]*?<(\\w+)>[^|$%.]*?\\|(\\d+)\\|[^|$%.]*?(\\d+\\.?\\d+)\\$";

        Pattern pattern = Pattern.compile(regex);

        double income = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String name = matcher.group(1);
                String product = matcher.group(2);
                int quantity = Integer.parseInt(matcher.group(3));
                double price = Double.parseDouble(matcher.group(4));

                double totalPrice = quantity * price;
                income += totalPrice;

                System.out.printf("%s: %s - %.2f%n", name, product, totalPrice);

            }

            input = scanner.nextLine();
        }

        System.out.println(String.format("Total income: %.2f", income));

    }
}




