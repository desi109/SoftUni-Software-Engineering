import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Messages messages = new Messages();

        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(messages.randomMessage());

        }
    }
}
