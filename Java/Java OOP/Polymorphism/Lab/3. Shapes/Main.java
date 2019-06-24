import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Shape> listOfShapes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] reminder = reader.readLine().split(" ");
            if (reminder.length == 1) {
                Shape circle = new Circle(Double.parseDouble(reminder[0]));
                listOfShapes.add(circle);
            } else {
                Rectangle rectangle = new Rectangle(Double.parseDouble(reminder[0]),
                        Double.parseDouble(reminder[1]));
                listOfShapes.add(rectangle);
            }
        }

        for (Shape shape : listOfShapes) {
            System.out.printf("%s:  P = %.1f   S = %.1f%n",
                    shape.selectName(),
                    shape.calculatePerimeter(),
                    shape.calculateArea());
        }
    }

}


