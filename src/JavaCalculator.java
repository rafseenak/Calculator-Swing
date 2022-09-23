import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JavaCalculator implements ActionListener
{
    boolean isOperatorClicked=false;
    boolean plus=false;
    boolean minus=false;
    boolean mul=false;
    boolean div=false;
    boolean dot=false;
    String oldValue;
    JFrame jf;
    JLabel displayLabel;
    JButton jb7;
    JButton jb8;
    JButton jb9;
    JButton jb4;
    JButton jb5;
    JButton jb6;
    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jbmul;
    JButton jbdiv;
    JButton jbdot;
    JButton jbminus;
    JButton jbplus;
    JButton jbzero;
    JButton jbequal;
    JButton jbclear;
    public JavaCalculator()
    {
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(400,700);
        jf.setLocation(800,50);

        displayLabel=new JLabel();
        displayLabel.setBounds(30,50,320,40);
        displayLabel.setBackground(Color.DARK_GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setFont(displayLabel.getFont().deriveFont(30f));
        jf.add(displayLabel);

        jb7=new JButton("7");
        jb7.setBounds(30,150,60,50);
        jb7.setFont(new Font("Arial",Font.PLAIN,40));
        jb7.addActionListener(this);
        jf.add(jb7);

        jb8=new JButton("8");
        jb8.setBounds(110,150,60,50);
        jb8.setFont(new Font("Arial",Font.PLAIN,40));
        jb8.addActionListener(this);
        jf.add(jb8);

        jb9=new JButton("9");
        jb9.setBounds(190,150,60,50);
        jb9.setFont(new Font("Arial",Font.PLAIN,40));
        jb9.addActionListener(this);
        jf.add(jb9);

        jbdiv=new JButton("/");
        jbdiv.setBounds(270,150,80,50);
        jbdiv.setFont(new Font("Arial",Font.PLAIN,40));
        jbdiv.addActionListener(this);
        jf.add(jbdiv);

        jb4=new JButton("4");
        jb4.setBounds(30,240,60,50);
        jb4.setFont(new Font("Arial",Font.PLAIN,40));
        jb4.addActionListener(this);
        jf.add(jb4);

        jb5=new JButton("5");
        jb5.setBounds(110,240,60,50);
        jb5.setFont(new Font("Arial",Font.PLAIN,40));
        jb5.addActionListener(this);
        jf.add(jb5);

        jb6=new JButton("6");
        jb6.setBounds(190,240,60,50);
        jb6.setFont(new Font("Arial",Font.PLAIN,40));
        jb6.addActionListener(this);
        jf.add(jb6);

        jbmul=new JButton("x");
        jbmul.setBounds(270,240,80,50);
        jbmul.setFont(new Font("Arial",Font.PLAIN,40));
        jbmul.addActionListener(this);
        jf.add(jbmul);

        jb1=new JButton("1");
        jb1.setBounds(30,330,60,50);
        jb1.setFont(new Font("Arial",Font.PLAIN,40));
        jb1.addActionListener(this);
        jf.add(jb1);

        jb2=new JButton("2");
        jb2.setBounds(110,330,60,50);
        jb2.setFont(new Font("Arial",Font.PLAIN,40));
        jb2.addActionListener(this);
        jf.add(jb2);

        jb3=new JButton("3");
        jb3.setBounds(190,330,60,50);
        jb3.setFont(new Font("Arial",Font.PLAIN,40));
        jb3.addActionListener(this);
        jf.add(jb3);

        jbminus=new JButton("-");
        jbminus.setBounds(270,330,80,50);
        jbminus.setFont(new Font("Arial",Font.PLAIN,40));
        jbminus.addActionListener(this);
        jf.add(jbminus);

        jbzero=new JButton("0");
        jbzero.setBounds(110,420,140,50);
        jbzero.setFont(new Font("Arial",Font.PLAIN,40));
        jbzero.addActionListener(this);
        jf.add(jbzero);

        jbequal=new JButton("=");
        jbequal.setBounds(190,510,160,50);
        jbequal.setFont(new Font("Arial",Font.PLAIN,40));
        jbequal.addActionListener(this);
        jf.add(jbequal);

        jbdot=new JButton(".");
        jbdot.setBounds(30,420,60,50);
        jbdot.setFont(new Font("Arial",Font.PLAIN,40));
        jbdot.addActionListener(this);
        jf.add(jbdot);

        jbplus=new JButton("+");
        jbplus.setBounds(270,420,80,50);
        jbplus.setFont(new Font("Arial",Font.PLAIN,40));
        jbplus.addActionListener(this);
        jf.add(jbplus);

        jbclear=new JButton("CLR");
        jbclear.setBounds(30,510,140,50);
        jbclear.setFont(new Font("Arial",Font.PLAIN,30));
        jbclear.addActionListener(this);
        jf.add(jbclear);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==jb7)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("7");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText() + "7");
            }
        }
        else if (e.getSource()==jb8)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("8");
                isOperatorClicked=false;
            }
            else {
                displayLabel.setText(displayLabel.getText() + "8");
            }
        }
        else if (e.getSource()==jb9)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("9");
                isOperatorClicked=false;
            }
            else {
                displayLabel.setText(displayLabel.getText() + "9");
            }
        }
        else if (e.getSource()==jb4)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("4");
                isOperatorClicked=false;
            }
            else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
        }
        else if (e.getSource()==jb5)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("5");
                isOperatorClicked=false;
            }
            else {
                displayLabel.setText(displayLabel.getText() + "5");
            }
        }
        else if (e.getSource()==jb6)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("6");
                isOperatorClicked=false;
            }
            else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
        }
        else if (e.getSource()==jb1)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("1");
                isOperatorClicked=false;
            }
            else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
        }
        else if (e.getSource()==jb2)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("2");
                isOperatorClicked=false;
            }
            else {
                displayLabel.setText(displayLabel.getText() + "2");
            }
        }
        else if (e.getSource()==jb3)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("3");
                isOperatorClicked=false;
            }
            else {
                displayLabel.setText(displayLabel.getText() + "3");
            }
        }
        else if (e.getSource()==jbzero)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("0");
                isOperatorClicked=false;
            }
            else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
        }
        else if (e.getSource()==jbdot)
        {
            if(isOperatorClicked)
            {
                if(!dot) {
                    displayLabel.setText(".");
                    dot=true;
                    isOperatorClicked = false;
                }
            }
            else {
                if(!dot)
                {
                    displayLabel.setText(displayLabel.getText() + ".");
                    dot=true;
                }
            }
        }
        else if (e.getSource()==jbdiv)
        {
            isOperatorClicked=true;
            div=true;
            oldValue=displayLabel.getText();
            dot=false;
            displayLabel.setText("");
        }
        else if (e.getSource()==jbminus)
        {
            isOperatorClicked=true;
            minus=true;
            oldValue=displayLabel.getText();
            dot=false;
            displayLabel.setText("");
        }
        else if (e.getSource()==jbmul)
        {
            isOperatorClicked=true;
            mul=true;
            oldValue=displayLabel.getText();
            dot=false;
            displayLabel.setText("");
        }
        else if (e.getSource()==jbplus)
        {
            isOperatorClicked=true;
            plus=true;
            oldValue=displayLabel.getText();
            dot=false;
            displayLabel.setText("");
        }
        else if (e.getSource()==jbclear)
        {
            displayLabel.setText("");
            dot=false;
        }
        else if (e.getSource()==jbequal)
        {
            try {
                String newValue = displayLabel.getText();
                float oldValueF = Float.parseFloat(oldValue);
                float newValueF = Float.parseFloat(newValue);
                if (plus) {
                    float result = oldValueF + newValueF;
                    displayLabel.setText(result + "");
                    plus = false;
                } else if (minus) {
                    float result = oldValueF - newValueF;
                    displayLabel.setText(result + "");
                    minus = false;
                } else if (mul) {
                    float result = oldValueF * newValueF;
                    displayLabel.setText(result + "");
                    mul = false;
                } else if (div) {
                    float result = oldValueF / newValueF;
                    displayLabel.setText(result + "");
                    div = false;
                }
            }
            catch (Exception ex)
            {
                displayLabel.setText("Error");
            }
        }
    }
}