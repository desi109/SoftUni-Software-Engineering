import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner chetec = new Scanner(System.in);
        int Do = Integer.parseInt(chetec.nextLine());

        for (int takoa = 2; takoa <= Do; takoa++) {
            boolean takovalie = true;
            for (int cepitel = 2; cepitel <= Math.sqrt(takoa); cepitel++) {
                if (takoa % cepitel == 0) {
                    takovalie = false;
                }
            }
            System.out.printf("%d -> %b%n", takoa, takovalie);
        }
    }
}
