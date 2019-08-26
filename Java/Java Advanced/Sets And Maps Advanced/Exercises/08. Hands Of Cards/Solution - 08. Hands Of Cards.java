import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, HashSet<String>> players = new LinkedHashMap<>();
        String line = "";

        while (!(line = scanner.nextLine()).equals("JOKER")) {
            String name = line.substring(0, line.indexOf(":"));

            ArrayList<String> cards = Arrays.stream(
                    line.substring(line.indexOf(":") + 2).split(", "))
                    .collect(Collectors.toCollection(ArrayList::new));

            if (!players.containsKey(name)) {
                players.put(name, new HashSet<>() {{
                    addAll(cards);
                }});
            } else {
                players.get(name).addAll(cards);
            }

        }

        for (Map.Entry<String, HashSet<String>> entry : players.entrySet()) {
            int deckPower = calculateDeckPower(entry.getValue());
            System.out.printf("%s: %d%n", entry.getKey(), deckPower);
        }
    }

    private static int calculateDeckPower(HashSet<String> deck) {
        int sumPower = 0;

        for (String card : deck) {
            int power = 0;
            if (Character.isDigit(card.charAt(0)) && card.charAt(0) != '1') {
                power += card.charAt(0) - '0';
            } else {
                switch (card.charAt(0)) {
                    case '1':
                        power += 10;
                        break;
                    case 'J':
                        power += 11;
                        break;
                    case 'Q':
                        power += 12;
                        break;
                    case 'K':
                        power += 13;
                        break;
                    case 'A':
                        power += 14;
                        break;
                }
            }


            switch (card.charAt(card.length() - 1)) {
                case 'S':
                    power *= 4;
                    break;
                case 'H':
                    power *= 3;
                    break;
                case 'D':
                    power *= 2;
                    break;

            }
            sumPower += power;
        }
        return sumPower;
    }
}
