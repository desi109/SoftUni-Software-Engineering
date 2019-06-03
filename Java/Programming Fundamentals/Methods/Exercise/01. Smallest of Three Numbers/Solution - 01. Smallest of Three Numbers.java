import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(checker(a, b, c));
    }

    static int checker(int a, int b, int c){

        int result = a;
        if (a > b && a > c && b > c) {
            result = c;
        }
        else if (a > b && a > c && c > b) {
            result = b;
        }
        return result;
    }
}

