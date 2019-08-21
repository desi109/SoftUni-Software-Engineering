import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> carNums = new HashSet<>();
        String line = "";

        while (!(line = scanner.nextLine()).equals("END")) {
            String[] command = line.split(", ");
            if (command[0].equals("IN")) {
                carNums.add(command[1]);
            } else {
                carNums.remove(command[1]);
            }
        }

        if (carNums.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : carNums) {
                System.out.println(s);
            }
        }

    }
}
















