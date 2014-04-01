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

    ButtonListener listener = new ButtonListener();

    public Calculator()
    {
        jp1.setLayout(new BorderLayout());
        jp3.setLayout(new GridLayout(6, 4, 5, 5));

        JTFdisplay.setHorizontalAlignment(SwingConstants.RIGHT);

        JB0.addActionListener(listener);
        JB1.addActionListener(listener);
        JB2.addActionListener(listener);
        JB3.addActionListener(listener);
        JB4.addActionListener(listener);
        JB5.addActionListener(listener);
        JB6.addActionListener(listener);
        JB7.addActionListener(listener);
        JB8.addActionListener(listener);
        JB9.addActionListener(listener);
        JBplus.addActionListener(listener);
        JBminus.addActionListener(listener);
        JBtimes.addActionListener(listener);
        JBdivide.addActionListener(listener);
        JBequals.addActionListener(listener);
        JBclear.addActionListener(listener);

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

    private class ButtonListener implements ActionListener
    {
        double total = 0, num1 = 0, num2 = 0;
        int operation;
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
                num1 = Double.parseDouble(JTFdisplay.getText());
                operation = 1;
                JTFdisplay.setText("0");
                System.out.println(num1 + "\t" + operation);
            }
            if(e.getSource() == JBminus)
            {
                num1 = Double.parseDouble(JTFdisplay.getText());
                operation = 2;
                JTFdisplay.setText("0");
                System.out.println(num1 + "\t" + operation);
            }
            if(e.getSource() == JBtimes)
            {
                num1 = Double.parseDouble(JTFdisplay.getText());
                operation = 3;
                JTFdisplay.setText("0");
                System.out.println(num1 + "\t" + operation);
            }
            if(e.getSource() == JBdivide)
            {
                num1 = Double.parseDouble(JTFdisplay.getText());
                operation = 4;
                JTFdisplay.setText("0");
                System.out.println(num1 + "\t" + operation);
            }

            if(e.getSource() == JBequals)
            {
                System.out.println(operation);
                num2 = Double.parseDouble(JTFdisplay.getText());
                if(operation == 1)
                {
                    total = num1 + num2;
                    JTFdisplay.setText("" + total);
                    System.out.println(num1 + "\t" + num2 + "\t" +operation + "\t" + total);
                }
                else if(operation == 2)
                {
                    total = num1 - num2;
                    JTFdisplay.setText("" + total);
                    System.out.println(num1 + "\t" + num2 + "\t" +operation + "\t" + total);
                }
                else if(operation == 3)
                {
                    total = num1 * num2;
                    JTFdisplay.setText("" + total);
                    System.out.println(num1 + "\t" + num2 + "\t" +operation + "\t" + total);
                }
                else if(operation == 4)
                {
                    if (num2 != 0)
                    {
                        total = num1/num2;
                        JTFdisplay.setText("" + total);
                    }
                    else
                    {
                        JTFdisplay.setText("ERROR: Div by 0");
                    }
                    System.out.println(num1 + "\t" + num2 + "\t" +operation + "\t" + total);
                }

            }

            if(e.getSource() == JBclear)
            {
                if(JTFdisplay.getText().equals("0"))
                {
                    num2 = 0;
                }
                total = 0;
                num1 = 0;
                JTFdisplay.setText("0");
            }

        }

    }
}
