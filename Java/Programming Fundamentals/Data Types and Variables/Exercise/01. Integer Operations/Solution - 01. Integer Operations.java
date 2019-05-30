import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int num1 = Integer.parseInt(scanner.nextLine());
       int num2 = Integer.parseInt(scanner.nextLine());
       int num3 = Integer.parseInt(scanner.nextLine());
       int num4 = Integer.parseInt(scanner.nextLine());
       int answer = ((num1 + num2) / num3) * num4;

        System.out.println(answer);

    }
}
