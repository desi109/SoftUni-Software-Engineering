import java.text.DecimalFormat;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());


        DecimalFormat format = new DecimalFormat("#.#####");
        double result = mathPower(number, power);
        System.out.println(format.format(result));

    }

    static double mathPower(double number, int power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
      
        return result;

    }

}
