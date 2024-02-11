import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ThreadPrinter extends Thread{
    int count;
    String msg;
    ThreadPrinter(String msg,int count){
        this.count=count;
        this.msg=msg;
    }
    synchronized public void run(){
        for(int i=0;i<count;i++){
            System.out.println(msg);
        }
    }
}
class ThreadGenerator extends Thread{
    int count;
    String msg;
    ThreadGenerator(String msg,int count){
        this.count=count;
        this.msg=msg;
    }
    public void run(){
        ThreadPrinter t=new ThreadPrinter(msg,count);
        t.start();
    }
}
class ThreadPrinterGUI implements ActionListener{
    JFrame jfrm;
    JTextField jtf;
    JButton b1;
    ThreadPrinterGUI(){
        jfrm=new JFrame("Printer");
        jtf=new JTextField(16);
        jfrm.setLayout(new FlowLayout());
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1=new JButton("PRINT");
        b1.addActionListener(this);
        jfrm.add(jtf);
        jfrm.add(b1);
    }
    public void actionPerformed(ActionEvent e){
        int count=Integer.parseInt(jtf.getText());
        ThreadGenerator t1=new ThreadGenerator("KOCHI",count);
        ThreadGenerator t2=new ThreadGenerator("THRIKKAKARA",count);
        t1.start();
        t2.start();
    }
    public static void main(String[] args) {
        ThreadPrinterGUI th=new ThreadPrinterGUI();
    }
}
