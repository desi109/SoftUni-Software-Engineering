import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> continent = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] command = line.split(" ");

            String continentName = command[0];
            String countryName = command[1];
            String cityName = command[2];

            List<String> cities = new ArrayList<>();
            LinkedHashMap<String, List<String>> countryCity = new LinkedHashMap<>();

            if (!continent.containsKey(continentName)) {
                continent.put(continentName, new LinkedHashMap<>() {{
                    put(countryName, new ArrayList<>() {{
                        add(cityName);
                    }});
                }});
            } else {
                if (!continent.get(continentName).containsKey(countryName)) {
                    continent.get(continentName).put(countryName, new ArrayList<>() {{
                        add(cityName);
                    }});
                } else {
                    continent.get(continentName).get(countryName).add(cityName);
                }
            }


        }

        for (String continentName : continent.keySet()) {
            System.out.printf("%s:%n", continentName);
            LinkedHashMap<String, ArrayList<String>> countryCity = continent.get(continentName);

            for (String countryName : countryCity.keySet()) {
                List<String> cities = countryCity.get(countryName);
                System.out.printf("%s -> ", countryName);
                String s = "";
                for (String cityName : cities) {
                    s += cityName + ", ";

                }
                System.out.print(s.substring(0, s.length() - 2));
                System.out.println();
            }
        }

    }
}
