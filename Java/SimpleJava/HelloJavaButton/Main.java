import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloJava3");
        frame.add(new HelloComponent("Hello, Java!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        frame.setVisible( true );
    }
}
