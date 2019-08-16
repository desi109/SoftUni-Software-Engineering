import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> games = new HashMap<String, Double>();

        // Add keys and values (Game, Price)
        games.put("OutFall 4", 39.99);
        games.put("CS: OG", 15.99);
        games.put("Zplinter Zell", 19.99);
        games.put("Honored 2", 59.99);
        games.put("RoverWatch", 29.99);
        games.put("RoverWatch Origins Edition", 39.99);
        
        double balance = Double.parseDouble(scanner.nextLine());
        double startBalance = balance;

        String line;
        String print;

        while (!(line = scanner.nextLine()).equals("Game Time")) {

            if (games.containsKey(line)) {
                if (balance < games.get(line)) {
                    print = "Too Expensive";
                } else {
                    balance -= games.get(line);
                    print = "Bought " + line;
                }
            } else {
                print = "Not Found";
            }

            System.out.println(print);
        }


        if (balance == 0) {
            System.out.println("Out of mo-ney!");

        } else {
            System.out.println(String.format
                    ("Total spent: $%.2f. Remaining: $%.2f",
                            startBalance - balance, balance));
        }
    }
}
