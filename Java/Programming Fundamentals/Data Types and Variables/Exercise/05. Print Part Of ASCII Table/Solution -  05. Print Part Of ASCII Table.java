import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        String answer = "";

        for (int i = start; i <= end ; i++) {
            char symbol = (char)i;
            answer += symbol;
            if(i != end){
                answer += " ";
            }
        }
        System.out.println(answer);

    }
}
