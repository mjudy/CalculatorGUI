import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JPanel
{
    JTextField JTFdisplay = new JTextField("0", 50);
    JButton JB0 = new JButton("0");
    JButton JB1 = new JButton("1");
    JButton JB2 = new JButton("2");
    JButton JB3 = new JButton("3");
    JButton JB4 = new JButton("4");
    JButton JB5 = new JButton("5");
    JButton JB6 = new JButton("6");
    JButton JB7 = new JButton("7");
    JButton JB8 = new JButton("8");
    JButton JB9 = new JButton("9");
    JButton JBdot = new JButton(".");
    JButton JBplus = new JButton("+");
    JButton JBminus = new JButton("-");
    JButton JBequals = new JButton("=");
    JButton JBtimes = new JButton("*");
    JButton JBdivide = new JButton("/");
    JButton JBclear = new JButton("CE");
    JButton JBmplus = new JButton("M+");
    JButton JBmMinus = new JButton("M-");
    JButton JBmr = new JButton("MR");
    JButton JBmc = new JButton("MC");
    JButton JBsign = new JButton("+/-");
    JButton JBroot = new JButton("Sq. Root");
    JButton JBpercent = new JButton("%");
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JPanel jp3 = new JPanel();

    public Calculator()
    {
        jp1.setLayout(new BorderLayout());
        jp3.setLayout(new GridLayout(6, 4, 5, 5));

        JTFdisplay.setHorizontalAlignment(SwingConstants.RIGHT);

        JB0.addActionListener(new Listener());
        JB1.addActionListener(new Listener());
        JB2.addActionListener(new Listener());
        JB3.addActionListener(new Listener());
        JB4.addActionListener(new Listener());
        JB5.addActionListener(new Listener());
        JB6.addActionListener(new Listener());
        JB7.addActionListener(new Listener());
        JB8.addActionListener(new Listener());
        JB9.addActionListener(new Listener());
        JBplus.addActionListener(new Listener());
        JBminus.addActionListener(new Listener());
        JBtimes.addActionListener(new Listener());
        JBdivide.addActionListener(new Listener());
        JBequals.addActionListener(new Listener());

        jp3.add(JBmc);
        jp3.add(JBroot);
        jp3.add(JBpercent);
        jp3.add(JBsign);

        jp3.add(JBclear);
        jp3.add(JBmplus);
        jp3.add(JBmMinus);
        jp3.add(JBmr);

        jp3.add(JB7);
        jp3.add(JB8);
        jp3.add(JB9);
        jp3.add(JBdivide);

        jp3.add(JB4);
        jp3.add(JB5);
        jp3.add(JB6);
        jp3.add(JBtimes);

        jp3.add(JB1);
        jp3.add(JB2);
        jp3.add(JB3);
        jp3.add(JBminus);

        jp3.add(JB0);
        jp3.add(JBdot);
        jp3.add(JBequals);
        jp3.add(JBplus);

        jp2.add(JTFdisplay);
        jp1.add(jp2, BorderLayout.NORTH);
        jp1.add(jp3, BorderLayout.CENTER);
        this.add(jp1);
    }

    private class Listener implements ActionListener
    {
        double[] list = new double[10];
        double total;
        int i;

        public void actionPerformed(ActionEvent e)
        {
            if(JTFdisplay.getText().equals("0"))
            {
                if(e.getSource() == JB1)
                {
                    JTFdisplay.setText("1");
                }
                if(e.getSource() == JB2)
                {
                    JTFdisplay.setText("2");
                }
                if(e.getSource() == JB3)
                {
                    JTFdisplay.setText("3");
                }
                if(e.getSource() == JB4)
                {
                    JTFdisplay.setText("4");
                }
                if(e.getSource() == JB5)
                {
                    JTFdisplay.setText("5");
                }
                if(e.getSource() == JB6)
                {
                    JTFdisplay.setText("6");
                }
                if(e.getSource() == JB7)
                {
                    JTFdisplay.setText("7");
                }
                if(e.getSource() == JB8)
                {
                    JTFdisplay.setText("8");
                }
                if(e.getSource() == JB9)
                {
                    JTFdisplay.setText("9");
                }
            }
            else
            {
                if(e.getSource() == JB0)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "0");
                }
                if(e.getSource() == JB1)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "1");
                }
                if(e.getSource() == JB2)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "2");
                }
                if(e.getSource() == JB3)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "3");
                }
                if(e.getSource() == JB4)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "4");
                }
                if(e.getSource() == JB5)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "5");
                }
                if(e.getSource() == JB6)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "6");
                }
                if(e.getSource() == JB7)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "7");
                }
                if(e.getSource() == JB8)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "8");
                }
                if(e.getSource() == JB9)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "9");
                }
            }

            if(e.getSource() == JBplus)
            {
                list[i] = Double.parseDouble(JTFdisplay.getText());
                i++;
            }
            if(e.getSource() == JBminus)
            {
                list[i] = Double.parseDouble(JTFdisplay.getText());
                i++;
            }
            if(e.getSource() == JBtimes)
            {
                list[i] = Double.parseDouble(JTFdisplay.getText());
                i++;
            }
            if(e.getSource() == JBdivide)
            {
                list[i] = Double.parseDouble(JTFdisplay.getText());
                i++;
            }
            if(e.getSource() == JBequals)
            {
                JTFdisplay.setText("" + total);
            }

        }

    }
}
