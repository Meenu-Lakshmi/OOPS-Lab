import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
    JFrame jfrm;
    JPanel buttonpanel;
    JTextField jtf;
    String s0,s1,s2;

    Calculator()
    {
        jfrm=new JFrame("Calculator");
        jfrm.getContentPane().setLayout(new GridLayout(0,1));
        buttonpanel = new JPanel(new GridLayout(4,4));
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.pack();
        jtf=new JTextField();
        jtf.setEditable(false);
        s1=s0=s2="";
        JButton[] button=new JButton[16];
        button[0]=new JButton("0");
        button[1]=new JButton("1");
        button[2]=new JButton("2");
        button[3]=new JButton("3");
        button[4]=new JButton("4");
        button[5]=new JButton("5");
        button[6]=new JButton("6");
        button[7]=new JButton("7");
        button[8]=new JButton("8");
        button[9]=new JButton("9");
        button[10]=new JButton("+");
        button[11]=new JButton("-");
        button[12]=new JButton("*");
        button[13]=new JButton("/");
        button[14]=new JButton("=");
        button[15]=new JButton("C");

        jfrm.add(jtf);
        for(int i=0;i<button.length;i++){
            button[i].addActionListener(this);
            buttonpanel.add(button[i]);
        }
        jfrm.add(buttonpanel);
    }
    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        if(Character.isDigit(s.charAt(0))||s.charAt(0)=='.'){
            if(!s1.equals("")){
                s2=s2+s;
                jtf.setText(s0+s1+s2);
            }
            else{
                s0=s0+s;
                jtf.setText(s0+s1+s2);
            }
        }
        else if(s.charAt(0)=='C'){
            s0=s1=s2="";
            jtf.setText(s0+s1+s2);
        }
        else if(s.charAt(0)=='='){
            double result;
            if(s1.equals("+"))
            {
                result=Double.parseDouble(s0)+Double.parseDouble(s2);
            }
            else if(s1.equals("-"))
            {
                result=Double.parseDouble(s0)-Double.parseDouble(s2);
            }
            else if(s1.equals("*"))
            {
                result=Double.parseDouble(s0)*Double.parseDouble(s2);
            }
            else{
                result=Double.parseDouble(s0)/Double.parseDouble(s2);
            }
            jtf.setText(s0+s1+s2+"="+result);
            s0=Double.toString(result);
            s1=s2="";
        }
        else{
            s1=s;
        }
    }
    public static void main(String[] args) {
        Calculator cl=new Calculator();
    }
}
