/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
/**
 * Simple  Calculate IN SWING 
 * @author Kartik
 */
class SUM extends JFrame implements ActionListener{
JLabel number1,number2,Result;
JTextField t1,t2;
JTextArea t3;
JButton b4,b5,b6,b7,b8;
    SUM(){
      super("Java_Core_swing");
              
               number1=new JLabel("number1");
               number1.setBounds(5,50,150,30);
           
               t1=new JTextField(20);
               t1.setBounds(200,80,150,30);

               number2=new JLabel("number2");
               number2.setBounds(5,50,150,30);
          
               t2=new JTextField(20);
               t2.setBounds(200,80,150,30);
          
               Result=new JLabel("result  =              ");
               Result.setBounds(5,50,150,30);
               t3=new JTextArea(10,15);
       b4=new JButton("SUM");
       b5=new JButton("Minus");
       b6=new JButton("Divide");
       b7=new JButton("Multiply");
       b8=new JButton("clear");
       setLayout(new FlowLayout());
       
       add(number1);
       add(t1);
       add(number2);
       add(t2);
       add(b4);
       add(b5);
       add(b6);
       add(b7);
       add(b8);
       add(Result);
       add(t3);   
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);  }
        public void actionPerformed(ActionEvent e) {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=0;
        if(e.getSource().equals(b4))
          c=a+b;
          if(e.getSource().equals(b5))
          c=a-b;
          if(e.getSource().equals(b6))
          c=a/b;
          if(e.getSource().equals(b7) && b!=0)
          c=a*b;
          if(e.getSource().equals(b8)){
              t1.setText(null);          
              t2.setText(null);          
              Result.setText(" "); 
      } 
          Result.setText(String.valueOf(Result.getText()+c));
          t3.setText(t1.getText()+"\n"+t2.getText()+"\n Result ="+c);
     } }
        public class calculater {
        public static void main(String[] ar){
        SUM ob=new SUM();
        ob.setSize(200,400);
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }}
