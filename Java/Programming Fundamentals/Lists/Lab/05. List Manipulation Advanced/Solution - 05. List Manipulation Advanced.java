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
                case "Contains":
                    int numToContains = Integer.parseInt(comand[1]);
                    if (intNumsList.contains(numToContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;


                case "Print":
                    String typeNum = comand[1];
                    if (typeNum.equals("even")) {
                        printEven(intNumsList);
                    } else {
                        printOdd(intNumsList);
                    }
                    break;


                case "Get":
                    int sum = 0;
                    for (int i = 0; i < intNumsList.size(); i++) {
                        sum += intNumsList.get(i);
                    }
                    System.out.println(sum);
                    break;


                case "Filter":
                    String filterCondition = comand[1];
                    int filterNum = Integer.parseInt(comand[2]);

                    switch (filterCondition) {
                        case ">":
                            List<Integer> result1 = new ArrayList<>();
                            for (int i = 0; i < intNumsList.size(); i++) {
                                if (intNumsList.get(i) > filterNum) {
                                    result1.add(intNumsList.get(i));
                                }
                            }
                            printList(result1);
                            break;

                        case ">=":
                            List<Integer> result2 = new ArrayList<>();
                            for (int i = 0; i < intNumsList.size(); i++) {
                                if (intNumsList.get(i) >= filterNum) {
                                    result2.add(intNumsList.get(i));
                                }
                            }
                            printList(result2);
                            break;

                        case "<":
                            List<Integer> result3 = new ArrayList<>();
                            for (int i = 0; i < intNumsList.size(); i++) {
                                if (intNumsList.get(i) < filterNum) {
                                    result3.add(intNumsList.get(i));
                                }
                            }
                            printList(result3);
                            break;

                        case "<=":
                            List<Integer> result4 = new ArrayList<>();
                            for (int i = 0; i < intNumsList.size(); i++) {
                                if (intNumsList.get(i) <= filterNum) {
                                    result4.add(intNumsList.get(i));
                                }
                            }
                            printList(result4);
                            break;
                    }
                    break;
            }
        }
    }

    

private static void printList(List<Integer> someList) {
        System.out.println(someList.toString()
                .replaceAll("\\[|,|\\]", ""));
    }

    private static void printEven(List<Integer> someList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i) % 2 == 0) {
                result.add(someList.get(i));
            }
        }
        printList(result);
    }

    private static void printOdd(List<Integer> someList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i) % 2 != 0) {
                result.add(someList.get(i));
            }
        }
        printList(result);
    }
}
