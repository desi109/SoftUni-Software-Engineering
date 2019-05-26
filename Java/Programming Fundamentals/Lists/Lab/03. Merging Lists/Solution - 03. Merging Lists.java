import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNums = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondNums = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int minLenght = Math.min(firstNums.size(), secondNums.size());
        List<Integer> resultList = new ArrayList<>();

        for(int i = 0; i < minLenght; i++){
            resultList.add(firstNums.get(i));
            resultList.add(secondNums.get(i));
        }


        if (firstNums.size() > secondNums.size()){
            resultList.addAll(firstNums
                    .subList(minLenght, firstNums.size()));
        }

        else {
            resultList.addAll(secondNums
            .subList(minLenght, secondNums.size()));
        }

        System.out.println(resultList.toString()
        .replaceAll("\\[|,|\\]", ""));
    }
}
