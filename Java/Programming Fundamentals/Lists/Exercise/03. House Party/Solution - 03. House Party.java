import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        int count = 0;
        String command = "";
        String name = "";

        List<String> guests = new ArrayList<String>();

        while (count < numberOfCommands) {
            command = scanner.nextLine();
            String[] part = command.split("\\s+");
            name = part[0];

            if (part[1].equals("is") && part[2].equals("going!")) {
                if (!guests.contains(name)) {
                    guests.add(name);
                } else {
                    System.out.println(String.format("%s is already in the list!", name));
                }
            }

            if (part[2].equals("not")) {
                if (guests.contains(name)) {
                    guests.remove(name);

                } else {
                    System.out.println(String.format("%s is not in the list!", name));
                }
            }
            count++;
        }
        
        for (String person : guests) {
            System.out.println(person);
        }
    }
}
