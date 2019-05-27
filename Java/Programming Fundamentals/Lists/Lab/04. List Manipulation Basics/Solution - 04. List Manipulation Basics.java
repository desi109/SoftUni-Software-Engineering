import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        List<Integer> intNumsList = new ArrayList<>();

        for (String num : numbers) {
            intNumsList.add(Integer.parseInt(num));
        }

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }

            String[] comand = line.split(" ");
            switch (comand[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(comand[1]);
                    intNumsList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(comand[1]);
                    intNumsList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemoveAt = Integer.parseInt(comand[1]);
                    intNumsList.remove(indexToRemoveAt);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(comand[1]);
                    int idexToInsert = Integer.parseInt(comand[2]);
                    intNumsList.add(idexToInsert, numToInsert);
                    break;
            }
        }

        System.out.println(intNumsList.toString().replaceAll("\\[|,|\\]", ""));
    }
}
