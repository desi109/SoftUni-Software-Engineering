import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYield = Integer.parseInt(scanner.nextLine());
        int spices = 0;
        int days = 0;


        if (startYield < 100) {
            System.out.println(days + "\n" + spices);
        } else {
            while (true) {

                if (startYield < 100) {
                    if (startYield - 26 >= 0) {
                        spices -= 26;
                    }

                    System.out.println(days + "\n" + spices);
                    break;
                }

                spices += startYield;
                if (spices <= 26) {
                    spices = 0;
                } else {
                    spices -= 26;
                }

                startYield -= 10;
                days++;

            }
        }
    }
}
