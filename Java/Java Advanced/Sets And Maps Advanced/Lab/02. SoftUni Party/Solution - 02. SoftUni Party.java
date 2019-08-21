import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> allPeople = new TreeSet<>();
        String line = "";

        while (!(line = scanner.nextLine()).equals("PARTY")) {
            allPeople.add(line);
        }


        while (!(line = scanner.nextLine()).equals("END")) {
            allPeople.remove(line);
        }
        System.out.println(allPeople.size());

        for (String p : allPeople) {
            System.out.println(p);
        }


    }
}




