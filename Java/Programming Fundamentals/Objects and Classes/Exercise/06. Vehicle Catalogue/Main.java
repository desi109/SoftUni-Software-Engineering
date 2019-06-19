import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        while (!line.equals("End")) {
            String[] date = line.split("\\s+");

            Vehicle vehicle = new Vehicle(
                    date[0],
                    date[1],
                    date[2],
                    Integer.parseInt(date[3]));
            vehicles.add(vehicle);

            line = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")) {
            String finalModel = model;

            vehicles
                    .stream()
                    .filter(v -> v.getModel().equals(finalModel))
                    .forEach(System.out::println);

            model = scanner.nextLine();
        }

        System.out.println(
                String.format("Cars have average horsepower of: %.2f.",
                        average(vehicles.stream()
                                .filter(v -> v.getType().equals("car"))
                                .collect(Collectors.toList()))));

        System.out.println(
                String.format("Trucks have average horsepower of: %.2f.",
                        average(vehicles.stream()
                                .filter(v -> v.getType().equals("truck"))
                                .collect(Collectors.toList()))));

    }

    private static double average(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        }

        double sum = 0;
        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getHp();
        }
        return (sum / vehicles.size());
    }
}
