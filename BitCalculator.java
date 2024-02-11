import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class BitCalculator implements ActionListener {
    JFrame jfrm;
    JButton b1;
    JRadioButton r1,r2;
    JTextField jtf;
    BitCalculator(){
        jfrm=new JFrame("Bit");
        jtf=new JTextField(16);
        jtf.setEditable(false);
        b1=new JButton("RESET");
        r1=new JRadioButton("bit 0");
        r2=new JRadioButton("bit 1");
        b1.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
        jfrm.setLayout(new FlowLayout());
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.add(jtf);
        jfrm.add(b1);
        jfrm.add(r1);
        jfrm.add(r2);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==r1||e.getSource()==r2){
            if(r1.isSelected()&&r2.isSelected()){
                jtf.setText("3");
            }
            else if(r2.isSelected()){
                jtf.setText("2");
            }
            else if(r1.isSelected()){
                jtf.setText("1");
            }
            else{
                jtf.setText("0");
            }
        }
        else if(e.getSource()==b1){
            r1.setSelected(false);
            r2.setSelected(false);
            jtf.setText("");
        }
    
    }
    public static void main(String[] args) {
        BitCalculator bt=new BitCalculator();
    }
}
