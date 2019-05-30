import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  number = scanner.nextLine();
        int answer = 0;
        for (int i = number.length()-1; i >= 0; i--) {
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            answer += num;
        }

        System.out.println(answer);

    }
}
