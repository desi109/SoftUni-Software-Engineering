import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        int result = multipliesEvensToOdds(number);
        System.out.println(result);
    }

    static int getTheSumOfEvenDigits(int number) {
        int evenSum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;

            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }
        }

        return evenSum;
    }

    static int getTheSumOfOddDigits(int number) {
        int oddSum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;

            if (lastDigit % 2 != 0) {
                oddSum += lastDigit;
            }
        }

        return oddSum;
    }

    static int multipliesEvensToOdds(int number) {
        int evenSum = getTheSumOfEvenDigits(number);
        int oddSum = getTheSumOfOddDigits(number);

        return evenSum * oddSum;
    }

}
