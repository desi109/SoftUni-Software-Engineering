import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double moneyAmount = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsaber = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int neededSabers = countOfStudents + (int) Math.ceil((double) countOfStudents * 0.1);
        int freeBelts = countOfStudents / 6;
        double totalSum = priceOfLightsaber * neededSabers +
                robePrice * countOfStudents +
                beltPrice * (countOfStudents - freeBelts);

        if (totalSum <= moneyAmount) {
            System.out.println(
                    String.format("The moneyAmount is enough - it would cost %.2flv.%n",
                            totalSum));
        } else {
            System.out.println(
                    String.format("Ivan Cho will need %.2flv more.%n",
                            totalSum - moneyAmount));
        }

    }
}
