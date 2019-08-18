import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = "";
        List<Boolean> checks = new ArrayList<>();

        while (!(line = scanner.nextLine()).equals("END")) {
            boolean check = true;

            if (line.length() % 2 == 0) {
                int lenFirstMethod = line.length();
                int middle = lenFirstMethod / 2;
                check = checkerOne(line, middle, lenFirstMethod, check);
            } else {
                int lenSecondMethod = line.length();
                int middle = (lenSecondMethod - 1) / 2;
                check = checkerTwo(line, middle, lenSecondMethod, check);
            }

            checks.add(check);
        }

        for (boolean check : checks) {
            System.out.println(check);
        }
    }

    public static boolean checkerOne(String line, int middle, int len, boolean check) {

        for (int i = 0; i <= middle - 1; i++) {

            if (line.charAt(i) != line.charAt(len - 1 - i)) {
                check = false;
            }
        }
        return check;
    }

    public static boolean checkerTwo(String line, int middle, int len, boolean check) {

        for (int i = 0; i <= middle; i++) {

            if (line.charAt(i) != line.charAt(len - 1 - i)) {
                check = false;
            }
        }

        return check;

    }
}

