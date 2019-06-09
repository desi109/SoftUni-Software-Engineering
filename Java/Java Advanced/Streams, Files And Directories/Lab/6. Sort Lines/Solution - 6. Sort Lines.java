import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) throws IOException {
        String userDir = System.getProperty("user.dir");

        Path pathIn = Paths.get(userDir + "/res/input.txt");
        Path pathOut = Paths.get(userDir + "/res/output.txt");

        List<String> inputLines = Files.readAllLines(pathIn)
                .parallelStream()
                .filter(s -> !s.isEmpty())
                .sorted().collect(Collectors.toList());

        Collections.sort(inputLines);
        Files.write(pathOut, inputLines);


    }
}
