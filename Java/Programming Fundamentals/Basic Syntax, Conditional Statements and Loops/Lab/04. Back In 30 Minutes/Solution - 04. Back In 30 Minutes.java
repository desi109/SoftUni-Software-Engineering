import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int minsAll = hour * 60 + min + 30;
        int newHour = minsAll / 60;
        if (newHour == 24) newHour = 0;
        int newMins = minsAll % 60;

        System.out.printf("%d:%02d", newHour, newMins);

    }
}
