import javax.swing.*;

public class Driver
{
    public static void main (String [] args)
    {
        JFrame JFwindow = new JFrame("Calculator");
        JFwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFwindow.getContentPane().add(new Calculator());
        JFwindow.pack();
        JFwindow.setVisible(true);
    }
}
