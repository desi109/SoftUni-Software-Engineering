import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = "";

        TreeMap<String, LinkedHashMap<String, Double>> shopProductPrice = new TreeMap<>();

        while (!(line = scanner.nextLine()).equals("Revision")) {
            String[] command = line.split(", ");

            String shop = command[0];
            String product = command[1];
            Double price = Double.parseDouble(command[2]);

            LinkedHashMap<String, Double> productPrice = new LinkedHashMap<>();

            if (shopProductPrice.containsKey(shop)) {
                productPrice = shopProductPrice.get(shop);
            }
            productPrice.put(product, price);
            shopProductPrice.put(shop, productPrice);
        }

        for (String shop : shopProductPrice.keySet()) {
            System.out.printf("%s->%n", shop);
            LinkedHashMap<String, Double> productPrice = shopProductPrice.get(shop);

            for (String product : productPrice.keySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", product, productPrice.get(product));
            }
        }

    }
}
