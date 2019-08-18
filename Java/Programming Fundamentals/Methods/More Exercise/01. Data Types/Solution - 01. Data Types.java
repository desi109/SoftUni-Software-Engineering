import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String n = scanner.nextLine();

        fun(type, n);
    }

    static void fun(String type, String n) {
        switch (type) {
            case "int":
                System.out.println(Integer.parseInt(n) * 2);
                break;
            case "real":
                System.out.println(String.format("%.2f", Double.parseDouble(n) * 1.5));
                break;
            case "string":
                System.out.println(String.format("$%s$", n));
                break;
        }
    }
}



