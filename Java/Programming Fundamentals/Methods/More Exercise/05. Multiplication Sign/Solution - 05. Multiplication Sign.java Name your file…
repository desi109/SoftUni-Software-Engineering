import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        double n3 = Double.parseDouble(scanner.nextLine());
        print(n1, n2, n3);
    }

    static void print(double n1, double n2, double n3) {
        int check = 1;
        if (n1 < 0) {
            check++;
        }
        if (n2 < 0) {
            check++;
        }
        if (n3 < 0) {
            check++;
        }

        if (n1 == 0 || n2 == 0 || n3 == 0) {
            check = 0;
        }

        checker(check);
    }

    static void checker(int check) {
        if (check % 2 != 0) {
            System.out.println("positive");
        } else if (check == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }
    }

}

