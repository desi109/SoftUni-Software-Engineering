import java.io.*;
import java.util.*;


public class Example {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");

        String inputPath = userDir + "/res/input.txt";
        String outputPath = userDir + "/res/output.txt";


        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, '.', ',', '!', '?');

        try (InputStream in = new FileInputStream(inputPath);
             OutputStream out = new FileOutputStream(outputPath)) {
            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {
                if (!symbols.contains((char) oneByte)) {
                    out.write(oneByte);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

