import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);

        System.out.println(print(a, b));
    }

    static String print(char a, char b) {

        int aInt = (int)a;
        int bInt = (int)b;
        String output = "";
        if(aInt > bInt){
            int c = aInt;
            aInt = bInt;
            bInt = c;
        }
        for (int i = aInt + 1; i < bInt; i++) {
            char char1 = (char) i;
            output += String.valueOf(char1);
            output += " ";
        }
        
        return output;
    }
}

