import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        
        char[][] keyboard = {{' '},
                {},{'a','b','c'},{'d','e','f'},
                {'g','h','i'},{'j','k','l'},{'m','n','o'},
                {'p','q','r','s'},{'t','u','v'}, {'w','x','y','z'}};
        
        String result = "";

        for (int i = 1; i <= n ; i++) {
            String line = scanner.nextLine();
            int len = line.length();
            int num = Integer.parseInt(String.valueOf(line.charAt(0)));

            result += keyboard[num][len - 1];
        }

        System.out.println(result);
    }
}
