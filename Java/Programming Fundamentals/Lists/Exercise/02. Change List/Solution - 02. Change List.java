import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = "";

        while (!(line = scanner.nextLine()).equals("end")) {

            String[] commands = line.split("\\s+");

            if (commands[0].equals("Delete")) {
                int numToRemove = Integer.parseInt(commands[1]);

                while (nums.contains(numToRemove)) {
                    nums.remove(Integer.valueOf(numToRemove));
                }
            } else {
                int element = Integer.parseInt(commands[1]);
                int index = Integer.parseInt(commands[2]);
                if (index < nums.size()) {
                    nums.add(index, element);
                }
            }
        }

        nums.forEach(n -> System.out.print(n + " "));

    }
}

