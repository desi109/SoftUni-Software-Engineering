import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class HelloComponent extends JComponent implements MouseMotionListener, ActionListener {
    String theMessage;
    int messageX = 125, messageY = 95; // Coordinates of the message
    JButton theButton;
    int colorIndex; // Current index into someColors
    static Color[] someColors = {
            Color.black, Color.red, Color.green, Color.blue, Color.magenta};

    public HelloComponent(String message) {
        theMessage = message;
        theButton = new JButton("Change Color");
        setLayout(new FlowLayout());
        add(theButton);
        theButton.addActionListener(this);
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void actionPerformed(ActionEvent e) {
        // Did somebody push our button?
        if (e.getSource() == theButton)
            changeColor();
    }

    synchronized private void changeColor() {
        // Change the index to the next color, awkwardly.
        if (++colorIndex == someColors.length)
            colorIndex = 0;
        setForeground(currentColor()); // Use the new color.
        repaint();
    }

    synchronized private Color currentColor() {
        return someColors[colorIndex];
    }
}
