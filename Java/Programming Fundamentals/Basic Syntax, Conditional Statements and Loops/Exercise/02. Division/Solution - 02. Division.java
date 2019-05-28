import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int devisions[] = {10, 7, 6, 3, 2};
        boolean opit = false;

        for (int i = 0; i < devisions.length; i++) {
            if (num % devisions[i] == 0) {
                opit = true;
                System.out.printf("The number is divisible by %d%n", devisions[i]);
                break;
            }
        }
        if (opit == false) {
            System.out.println("Not divisible");


        }

    }
}
