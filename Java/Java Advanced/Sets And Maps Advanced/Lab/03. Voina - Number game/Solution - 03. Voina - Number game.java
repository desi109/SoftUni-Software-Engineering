import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line1 = scanner.nextLine().split("\\s+");
        LinkedHashSet<Integer> player1 = new LinkedHashSet<>();
        for (int i = 0; i < line1.length; i++) {
            player1.add(Integer.parseInt(line1[i]));
        }


//        List<Integer> line = Array.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//
//        LinkedHashSet<Integer> player = new LinkedHashSet<>(line);
//        player.addAll(line);


        String[] line2 = scanner.nextLine().split("\\s+");
        LinkedHashSet<Integer> player2 = new LinkedHashSet<>();
        for (int i = 0; i < line2.length; i++) {
            player2.add(Integer.parseInt(line2[i]));
        }

        for (int i = 0; i < 50; i++) {
            if (player1.isEmpty()) {
                System.out.println("Second player win!");
                return;
            }
            if (player2.isEmpty()) {
                System.out.println("First player win!");
                return;
            }

            Integer playerOneCards = getTopValue(player1);
            Integer playerSecondCards = getTopValue(player2);

            player1.remove(playerOneCards);
            player2.remove(playerSecondCards);

            if (playerOneCards > playerSecondCards) {
                player1.add(playerOneCards);
                player1.add(playerSecondCards);
            } else if(playerSecondCards > playerOneCards){
                player2.add(playerOneCards);
                player2.add(playerSecondCards);
            }else {
                player1.add(playerOneCards);
                player2.add(playerSecondCards);
            }
        }


        if (player1.size() > player2.size()) {
            System.out.println("First player win!");
        } else if (player2.size() > player1.size()) {
            System.out.println("Second player win!");
        } else {

            System.out.println("Draw!");
        }
    }

    private static Integer getTopValue(LinkedHashSet<Integer> set) {
        for (Integer i : set) {
            return i;
        }

        return 0;
    }


}




