import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        fun(x1, y1, x2, y2);

    }

    static void fun(int x1, int y1, int x2, int y2) {
        if( (x1*x1 + y1*y1) <= (x2*x2 + y2*y2) ){
            System.out.println(String.format("(%d, %d)", x1, y1));
        }else {
            System.out.println(String.format("(%d, %d)", x2, y2));
        }
    }
}



