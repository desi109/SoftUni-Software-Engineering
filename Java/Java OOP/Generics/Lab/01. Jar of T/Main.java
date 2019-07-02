import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jar<String> jar = new Jar<>();

        jar.add(scanner.nextLine());
        jar.add(scanner.nextLine());

        System.out.println(jar.remove());

    }
}
