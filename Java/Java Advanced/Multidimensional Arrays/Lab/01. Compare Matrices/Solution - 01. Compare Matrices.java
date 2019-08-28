import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lineN = scanner.nextLine().split("\\s+");
        int n1 = Integer.parseInt(lineN[0]);
        int n2 = Integer.parseInt(lineN[1]);
        List<String> n = new ArrayList<>();

        for (int j = 0; j < n1; j++) {
            String[] inputN = scanner.nextLine().split("\\s+");
            for (int i = 0; i < inputN.length; i++) {
                n.add(inputN[i]);
            }
        }

        String[] lineM = scanner.nextLine().split("\\s+");
        int m1 = Integer.parseInt(lineM[0]);
        int m2 = Integer.parseInt(lineM[1]);
        List<String> m = new ArrayList<>();

        for (int j = 0; j < m1; j++) {
            String[] inputM = scanner.nextLine().split("\\s+");
            for (int i = 0; i < inputM.length; i++) {
                m.add(inputM[i]);
            }
        }

        boolean checker = true;

        if (n.size() != m.size()) {
            checker = false;
        } else {

            for (int i = 0; i < n.size(); i++) {
                if (!(n.get(i).equals(m.get(i)))) {
                    checker = false;
                }
            }
        }

        if (checker == false) {
            System.out.println("not equal");
        } else if (checker == true) {
            System.out.println("equal");
        }

    }
}

