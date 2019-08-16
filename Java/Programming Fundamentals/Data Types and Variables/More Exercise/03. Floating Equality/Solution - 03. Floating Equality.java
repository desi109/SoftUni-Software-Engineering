import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        double epsilon = 0.000001;
        
        if (first < second) {
            double temp = first;
            first = second;
            second = temp;
        }
        if (first - second < epsilon) {
            System.out.println("True");
        } else  {
            System.out.println("False");
        }
    }
}
