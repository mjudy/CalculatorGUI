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

    Font aFont = new Font("Arial", Font.ITALIC, 22);
    ImageIcon anIcon = new ImageIcon("icon.png");

    ExtendedButton EB0 = new ExtendedButton("0", anIcon, aFont);
    ExtendedButton EB1 = new ExtendedButton("1", anIcon, aFont);
    ExtendedButton EB2 = new ExtendedButton("2", anIcon, aFont);
    ExtendedButton EB3 = new ExtendedButton("3", anIcon, aFont);
    ExtendedButton EB4 = new ExtendedButton("4", anIcon, aFont);
    ExtendedButton EB5 = new ExtendedButton("5", anIcon, aFont);
    ExtendedButton EB6 = new ExtendedButton("6", anIcon, aFont);
    ExtendedButton EB7 = new ExtendedButton("7", anIcon, aFont);
    ExtendedButton EB8 = new ExtendedButton("8", anIcon, aFont);
    ExtendedButton EB9 = new ExtendedButton("9", anIcon, aFont);
    ExtendedButton EBdot = new ExtendedButton(".", anIcon, aFont);
    ExtendedButton EBplus = new ExtendedButton("+", anIcon, aFont);
    ExtendedButton EBminus = new ExtendedButton("-", anIcon, aFont);
    ExtendedButton EBequals = new ExtendedButton("=", anIcon, aFont);
    ExtendedButton EBtimes = new ExtendedButton("*", anIcon, aFont);
    ExtendedButton EBdivide = new ExtendedButton("/", anIcon, aFont);
    ExtendedButton EBclear = new ExtendedButton("CE", anIcon, aFont);
    ExtendedButton EBmplus = new ExtendedButton("M+", anIcon, aFont);
    ExtendedButton EBmMinus = new ExtendedButton("M-", anIcon, aFont);
    ExtendedButton EBmr = new ExtendedButton("MR", anIcon, aFont);
    ExtendedButton EBmc = new ExtendedButton("MC", anIcon, aFont);
    ExtendedButton EBsign = new ExtendedButton("+/-", anIcon, aFont);
    ExtendedButton EBroot = new ExtendedButton("Sq. Root", anIcon, aFont);
    ExtendedButton EBpercent = new ExtendedButton("%", anIcon, aFont);

    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JPanel jp3 = new JPanel();
    JPanel jp4 = new JPanel();

    ButtonListener listener = new ButtonListener();
    ExtendedButtonListener extendedListener = new ExtendedButtonListener();

    public Calculator()
    {
        jp1.setLayout(new BorderLayout());
        jp3.setLayout(new GridLayout(6, 4, 5, 5));
        jp4.setLayout(new GridLayout(6, 4, 5, 5));

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

        EB0.addActionListener(extendedListener);
        EB1.addActionListener(extendedListener);
        EB2.addActionListener(extendedListener);
        EB3.addActionListener(extendedListener);
        EB4.addActionListener(extendedListener);
        EB5.addActionListener(extendedListener);
        EB6.addActionListener(extendedListener);
        EB7.addActionListener(extendedListener);
        EB8.addActionListener(extendedListener);
        EB9.addActionListener(extendedListener);
        EBplus.addActionListener(extendedListener);
        EBminus.addActionListener(extendedListener);
        EBtimes.addActionListener(extendedListener);
        EBdivide.addActionListener(extendedListener);
        EBequals.addActionListener(extendedListener);
        EBclear.addActionListener(extendedListener);

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

        jp4.add(EBmc);
        jp4.add(EBroot);
        jp4.add(EBpercent);
        jp4.add(EBsign);

        jp4.add(EBclear);
        jp4.add(EBmplus);
        jp4.add(EBmMinus);
        jp4.add(EBmr);

        jp4.add(EB7);
        jp4.add(EB8);
        jp4.add(EB9);
        jp4.add(EBdivide);

        jp4.add(EB4);
        jp4.add(EB5);
        jp4.add(EB6);
        jp4.add(EBtimes);

        jp4.add(EB1);
        jp4.add(EB2);
        jp4.add(EB3);
        jp4.add(EBminus);

        jp4.add(EB0);
        jp4.add(EBdot);
        jp4.add(EBequals);
        jp4.add(EBplus);

        jp1.add(jp2, BorderLayout.NORTH);
        jp1.add(jp3, BorderLayout.CENTER);
        jp1.add(jp4, BorderLayout.SOUTH);
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
            }
            if(e.getSource() == JBminus)
            {
                num1 = Double.parseDouble(JTFdisplay.getText());
                operation = 2;
                JTFdisplay.setText("0");
            }
            if(e.getSource() == JBtimes)
            {
                num1 = Double.parseDouble(JTFdisplay.getText());
                operation = 3;
                JTFdisplay.setText("0");
            }
            if(e.getSource() == JBdivide)
            {
                num1 = Double.parseDouble(JTFdisplay.getText());
                operation = 4;
                JTFdisplay.setText("0");
            }

            if(e.getSource() == JBequals)
            {
                System.out.println(operation);
                num2 = Double.parseDouble(JTFdisplay.getText());
                if(operation == 1)
                {
                    total = num1 + num2;
                    JTFdisplay.setText("" + total);
                }
                else if(operation == 2)
                {
                    total = num1 - num2;
                    JTFdisplay.setText("" + total);
                }
                else if(operation == 3)
                {
                    total = num1 * num2;
                    JTFdisplay.setText("" + total);
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

    private class ExtendedButtonListener implements ActionListener
    {
        double total = 0, num1 = 0, num2 = 0;
        int operation;
        public void actionPerformed(ActionEvent e)
        {
            if(JTFdisplay.getText().equals("0"))
            {
                if(e.getSource() == EB1)
                {
                    JTFdisplay.setText("1");
                }
                if(e.getSource() == EB2)
                {
                    JTFdisplay.setText("2");
                }
                if(e.getSource() == EB3)
                {
                    JTFdisplay.setText("3");
                }
                if(e.getSource() == EB4)
                {
                    JTFdisplay.setText("4");
                }
                if(e.getSource() == EB5)
                {
                    JTFdisplay.setText("5");
                }
                if(e.getSource() == EB6)
                {
                    JTFdisplay.setText("6");
                }
                if(e.getSource() == EB7)
                {
                    JTFdisplay.setText("7");
                }
                if(e.getSource() == EB8)
                {
                    JTFdisplay.setText("8");
                }
                if(e.getSource() == EB9)
                {
                    JTFdisplay.setText("9");
                }
            }
            else
            {
                if(e.getSource() == EB0)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "0");
                }
                if(e.getSource() == EB1)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "1");
                }
                if(e.getSource() == EB2)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "2");
                }
                if(e.getSource() == EB3)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "3");
                }
                if(e.getSource() == EB4)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "4");
                }
                if(e.getSource() == EB5)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "5");
                }
                if(e.getSource() == EB6)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "6");
                }
                if(e.getSource() == EB7)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "7");
                }
                if(e.getSource() == EB8)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "8");
                }
                if(e.getSource() == EB9)
                {
                    JTFdisplay.setText(JTFdisplay.getText() + "9");
                }
            }

            if(e.getSource() == EBplus)
            {
                num1 = Double.parseDouble(JTFdisplay.getText());
                operation = 1;
                JTFdisplay.setText("0");
            }
            if(e.getSource() == EBminus)
            {
                num1 = Double.parseDouble(JTFdisplay.getText());
                operation = 2;
                JTFdisplay.setText("0");
            }
            if(e.getSource() == EBtimes)
            {
                num1 = Double.parseDouble(JTFdisplay.getText());
                operation = 3;
                JTFdisplay.setText("0");
            }
            if(e.getSource() == EBdivide)
            {
                num1 = Double.parseDouble(JTFdisplay.getText());
                operation = 4;
                JTFdisplay.setText("0");
            }

            if(e.getSource() == EBequals)
            {
                System.out.println(operation);
                num2 = Double.parseDouble(JTFdisplay.getText());
                if(operation == 1)
                {
                    total = num1 + num2;
                    JTFdisplay.setText("" + total);
                }
                else if(operation == 2)
                {
                    total = num1 - num2;
                    JTFdisplay.setText("" + total);
                }
                else if(operation == 3)
                {
                    total = num1 * num2;
                    JTFdisplay.setText("" + total);
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
                }

            }

            if(e.getSource() == EBclear)
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
