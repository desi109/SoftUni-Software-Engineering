import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
        String userDir = System.getProperty("user.dir");

        File file = new File("C:\\Users\\Dess\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.printf("%s: [%s]%n",
                                f.getName(), f.length());
                    }
                }
            }
        }

    }
}
