/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author abc
 */
class Myframee extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b;
    Myframee(){
        super("additing two number");
        l1=new JLabel("1st");
        t1=new JTextField(10);
        l2=new JLabel("2st");
        t2=new JTextField(10);
        l3=new JLabel("result");
        t3=new JTextField(10);
        b=new JButton("sum");
        setLayout(new FlowLayout());
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(b);
    b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
         int r=Integer.parseInt(t1.getText());
   int m=Integer.parseInt(t2.getText());
   if(e.getSource()==b){
       t3.setText(String.valueOf(r+m));
       System.out.println(t3);
   }
    }

   
}
public class addingtow {
 public static void main(String[] args){
  
     Myframee obj=new Myframee();
   obj.setSize(500,500);
   obj.setVisible(true);
   obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
