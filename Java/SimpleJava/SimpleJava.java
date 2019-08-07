import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String name = "", s_age = "";
        int age;
        name = JOptionPane.showInputDialog("Please enter your name");
        s_age = JOptionPane.showInputDialog("How old are You?");
        age = Integer.parseInt(s_age);
        String msg = "Hello " + name + " next year,you'll be " + (age + 1);

        JOptionPane.showMessageDialog(null, msg);
    }
}
