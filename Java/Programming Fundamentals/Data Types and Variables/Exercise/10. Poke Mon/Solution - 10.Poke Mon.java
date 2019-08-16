import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int n = Integer.parseInt(keys.nextLine());
        double snowballValue = 0;
        double maxSnowballValue = 0;
        int snowballSnowOut = 0;
        int snowballTimeOut = 0;
        int snowballQualityOut = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(keys.nextLine());
            int snowballTime = Integer.parseInt(keys.nextLine());
            int snowballQuality = Integer.parseInt(keys.nextLine());

            snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;
                snowballSnowOut = snowballSnow;
                snowballTimeOut = snowballTime;
                snowballQualityOut = snowballQuality;

            }

        }
        
        System.out.printf("%d : %d = %.0f (%d)",
                snowballSnowOut, snowballTimeOut, maxSnowballValue, snowballQualityOut);

    }
}
