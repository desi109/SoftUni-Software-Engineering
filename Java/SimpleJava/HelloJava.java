import javax.swing.*;
import java.awt.*;

public class HelloJava {

    public static void main( String[] args ) {
        JFrame frame = new JFrame( "Java App" );
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );
        frame.add(label);
        frame.setSize( 500, 500);
        label.setFont(new Font("Courier", Font.ITALIC,35));
        label.setForeground(Color.red);;
        frame.setVisible( true );
    }
}
