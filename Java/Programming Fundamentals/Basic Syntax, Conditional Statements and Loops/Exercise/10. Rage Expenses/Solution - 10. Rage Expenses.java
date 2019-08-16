import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int lostCount = Integer.parseInt(scanner.nextLine());

        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadset = 0;
        int trashedMouse = 0;
        int trashedKeyboards = 0;
        int trashedDisplays = 0;

        for (int a = 1; a <= lostCount; a++) {
            if (a % 2 == 0) {
                trashedHeadset++;
            }
            if (a % 3 == 0) {
                trashedMouse++;
            }
            if (a % 2 == 0 && a % 3 == 0) {
                trashedKeyboards++;
                if (trashedKeyboards % 2 == 0) {
                    trashedDisplays++;
                }
            }
        }

        double result = (trashedHeadset*headsetPrice) +
                (trashedMouse*mousePrice) +
                (trashedKeyboards*keyboardPrice) +
                (trashedDisplays*displayPrice);

        System.out.printf("Rage expenses: %.2f lv.",result);
    }
}
