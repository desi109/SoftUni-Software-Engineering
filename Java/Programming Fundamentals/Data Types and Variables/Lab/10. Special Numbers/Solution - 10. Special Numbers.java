import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kolkko = Integer.parseInt(scanner.nextLine());
        int obshto = 0;
        int takova = 0;
        boolean toe = false;
        for (int ch = 1; ch <= kolkko; ch++) {
            takova = ch;
            while (ch > 0) {
                obshto += ch % 10;
                ch = ch / 10;
            }
            toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
            String answer = "False";
            if (toe == true) {
                answer = "True";
            }
            System.out.printf("%d -> %s\n", takova, answer);
            obshto = 0;
            ch = takova;
        }

    }
}
