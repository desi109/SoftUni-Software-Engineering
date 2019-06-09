import java.util.*;
import java.io.*;

public class Example {
    public static void main(String[] args) throws FileNotFoundException {
        String userDir = System.getProperty("user.dir");

        String inputPath = userDir + "/res/input.txt";
        String outputPath = userDir + "/res/output.txt";

        Scanner scanner =
                new Scanner(new FileInputStream(inputPath));

        PrintWriter out =
                new PrintWriter(new FileOutputStream(outputPath));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt())
                out.println(scanner.nextInt());

            scanner.next();
        }
        out.close();


    }
}

