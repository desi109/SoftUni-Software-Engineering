import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command) {
            case "int":
                int aInt = Integer.parseInt(scanner.nextLine());
                int bInt = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(aInt, bInt));
                break;
            case "char":
                char aCh = scanner.nextLine().charAt(0);
                char bCh = scanner.nextLine().charAt(0);
                System.out.println(getMax(aCh, bCh));
                break;
            case "string":
                String aSt = scanner.nextLine();
                String bSt = scanner.nextLine();
                System.out.println(getMax(aSt, bSt));
                break;
        }


    }

    static int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }

    static char getMax(char first, char second) {
        if ((int) first > (int) second) {
            return first;
        } else {
            return second;
        }
    }

}


