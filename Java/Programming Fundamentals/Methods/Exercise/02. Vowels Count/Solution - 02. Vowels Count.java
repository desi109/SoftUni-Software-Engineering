import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);
            switch (word) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 1;
                    break;
                case 'i':
                    sum += 1;
                    break;
                case 'o':
                    sum += 1;
                    break;
                case 'u':
                    sum += 1;
                    break;
                case 'A':
                    sum += 1;
                    break;
                case 'E':
                    sum += 1;
                    break;
                case 'I':
                    sum += 1;
                    break;
                case 'O':
                    sum += 1;
                    break;
                case 'U':
                    sum += 1;
                    break;
            }

        }
        System.out.println(sum);

    }
}




