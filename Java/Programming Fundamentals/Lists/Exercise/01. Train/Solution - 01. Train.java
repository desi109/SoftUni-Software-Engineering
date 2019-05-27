import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int sizeN = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        while (!line.equals("end")){
            String[] comand = line.split(" ");

            if(comand.length == 2){
                int num = Integer.parseInt(comand[1]);
                numbers.add(num);
            }

            else {
                int numToAdd = Integer.parseInt(comand[0]);
                for (int i = 0; i < numbers.size() ; i++) {
                    if ((numbers.get(i)+numToAdd) <= sizeN){
                        numbers.set(i, (numbers.get(i)+numToAdd));
                        break;
                    }
                }
            }
            line = scanner.nextLine();
        }
        System.out.println(numbers.toString()
                .replaceAll("\\[|,|\\]", ""));

    }
}
