import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Rectangle> listOfRectangles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] reminder = reader.readLine().split(" ");
            if (reminder.length == 1) {
                Rectangle square = new Square(Double.parseDouble(reminder[0]));
                listOfRectangles.add(square);
            } else {
                Rectangle rectangle = new Rectangle(Double.parseDouble(reminder[0]),
                        Double.parseDouble(reminder[1]));
                listOfRectangles.add(rectangle);
            }
        }

        for (Rectangle rectangle : listOfRectangles) {
            System.out.println(rectangle.area());
        }
    }

}
