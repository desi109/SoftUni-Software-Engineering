import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokemonPowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int count = 0;
        double sum = pokemonPowerN;

        while (distanceM <= pokemonPowerN) {
            pokemonPowerN = pokemonPowerN - distanceM;
            count++;

            if (pokemonPowerN == (sum * 0.50)) {
                if (exhaustionFactorY > 0) {
                    pokemonPowerN = pokemonPowerN / exhaustionFactorY;
                }
            }
        }

        System.out.println(pokemonPowerN);
        System.out.println(count);
    }
}
