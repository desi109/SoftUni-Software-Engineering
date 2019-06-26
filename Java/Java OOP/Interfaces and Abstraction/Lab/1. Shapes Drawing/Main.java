import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Drawable> listOfShapes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] reminder = reader.readLine().split(" ");
            if (reminder.length == 1) {
                Drawable circle = new Circle(Integer.parseInt(reminder[0]));
                listOfShapes.add(circle);
            } else {
                Rectangle rectangle = new Rectangle(Integer.parseInt(reminder[0]),
                        Integer.parseInt(reminder[1]));
                listOfShapes.add(rectangle);
            }
        }

        for (Drawable shape : listOfShapes) {
            shape.draw();
        }

    }

}


