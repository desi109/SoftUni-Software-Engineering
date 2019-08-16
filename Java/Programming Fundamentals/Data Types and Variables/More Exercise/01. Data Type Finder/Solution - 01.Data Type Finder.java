import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";

        while (!(line = scanner.nextLine()).equals("END")) {
            boolean isInt = true;

            try {
                int integer = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                isInt = false;
            }

            boolean isDouble = true;
            try {
                double doubl = Double.parseDouble(line);
            } catch (NumberFormatException e) {
                isDouble = false;
            }

            if (isInt) {
                System.out.printf("%s is integer type%n", line);
            } else if (isDouble) {
                System.out.printf("%s is floating point type%n", line);
            } else if (line.length() == 1) {
                System.out.printf("%s is character type%n", line);
            } else if (line.equalsIgnoreCase("true") || (line.equalsIgnoreCase("false"))) {
                System.out.printf("%s is boolean type%n", line);
            } else {
                System.out.printf("%s is string type%n", line);
            }
        }
    }
}
