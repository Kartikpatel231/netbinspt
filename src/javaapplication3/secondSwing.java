/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author abc
 */
class MyFrame extends JFrame implements ActionListener{
    JLabel l1;
    JButton b;
    int count=0;
    MyFrame(){
        super("Swing Demo");
        setLayout(new FlowLayout());
        l1=new JLabel("Clicked"+count+" Times");
        b=new JButton("click");
        add(l1);
        add(b);
     //   add(new JButton("Cancel"));
        b.addActionListener(this);
        b.setIcon(new ImageIcon("C:/Users/abc/Desktop/images/15-august-independence-day"));
        getRootPane().setDefaultButton(b);
    }
public void actionPerformed(ActionEvent e) {
    count++;
l1.setText("clicked"+count+" Times");
}
}
public class secondSwing {
    public static void main(String[] args){
    MyFrame f=new MyFrame();
    f.setSize(500,500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}