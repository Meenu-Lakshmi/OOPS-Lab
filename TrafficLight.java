import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class TrafficLight implements ActionListener
{
    JFrame jfrm;
    JTextField jtf;
    JRadioButton r1,r2,r3;
    ButtonGroup bg;

    TrafficLight(){
        jfrm=new JFrame("Trafficlight");
        jfrm.setLayout(new FlowLayout());
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(800,800);

        jtf=new JTextField(10);
        jtf.setEditable(false);

        r1=new JRadioButton("RED");
        r2=new JRadioButton("YELLOW");
        r3=new JRadioButton("GREEN");
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        jfrm.add(r1);
        jfrm.add(r2);
        jfrm.add(r3);
        jfrm.add(jtf);
    }
    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        if(s.equals("RED")){
            jfrm.getContentPane().setBackground(Color.RED);
            jtf.setText("STOP");
        }
        if(s.equals("YELLOW")){
            jfrm.getContentPane().setBackground(Color.YELLOW);
            jtf.setText("WAIT");
        }
        if(s.equals("GREEN")){
            jfrm.getContentPane().setBackground(Color.GREEN);
            jtf.setText("GO");
        }
    }
    public static void main(String[] args) {
        TrafficLight tf=new TrafficLight();
    }
}
