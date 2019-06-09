import java.io.*;

public class Example {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");

        String inputPath = userDir + "/res/input.txt";
        String outputPath = userDir + "/res/output.txt";

        try (InputStream in = new FileInputStream(inputPath);
             OutputStream out = new FileOutputStream(outputPath)) {

            int oneByte = in.read();

            while (oneByte >= 0) {
                if (oneByte == 32 || oneByte == 10) {
                    out.write(oneByte);
                } else {
                    String byteASText = String.valueOf(oneByte);
                    for (int i = 0; i < byteASText.length(); i++) {
                        int symbol = byteASText.charAt(i);
                        out.write(symbol);
                    }
                }
                oneByte = in.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

