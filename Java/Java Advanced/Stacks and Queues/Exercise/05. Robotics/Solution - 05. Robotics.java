import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(";");

        String[] robots = new String[input.length];
        int[] processTime = new int[input.length];
        int[] workTime = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            String[] data = input[i].split("-");
            String name = data[0];
            int time = Integer.parseInt(data[1]);
            robots[i] = name;
            processTime[i] = time;
        }

        String startTime = scanner.nextLine();

        ArrayDeque<String> products = new ArrayDeque<>();

        String inputProduct = "";

        while (!(inputProduct = scanner.nextLine()).equals("End")) {
            products.offer(inputProduct);
        }

        String[] timeData = startTime.split(":");
        int hours = Integer.parseInt(timeData[0]);
        int min = Integer.parseInt(timeData[1]);
        int sec = Integer.parseInt(timeData[2]);

        long beginSec = hours * 3600 + min * 60 + sec;

        while (!products.isEmpty()) {
            beginSec++;

            String product = products.poll();
            boolean isAssigned = false;

            for (int i = 0; i < robots.length; i++) {
                if (workTime[i] == 0 && !isAssigned) {
                    workTime[i] = processTime[i];
                    isAssigned = true;
                    printRobotData(robots[i], product, beginSec);
                }
                if (workTime[i] > 0) {
                    workTime[i]--;
                }
            }
            if (!isAssigned) {
                products.offer(product);
            }
        }
    }


    private static void printRobotData(String robot, String product, long beginSec) {
        long s = beginSec % 60;
        long m = (beginSec / 60) % 60;
        long h = (beginSec / (60 * 60)) % 24;

        System.out.println(robot + " - " + product +
                String.format(" [%02d:%02d:%02d]", h, m, s));
    }
}
