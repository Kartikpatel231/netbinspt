/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
/**
 *Simple AWT program for event handling in java
 * @author Kartik
 */
class myframe1 extends Frame implements ActionListener{
Label l1,l2;
TextField tf;
Button b;
myframe1(){
    super("Java_Core_Tricks ");
            l1=new Label("university");
            l2=new Label();
            tf=new TextField(20);
            b=new Button("Action performed");
            setLayout(new FlowLayout());
            add(l1);
            add(tf);
            add(b);
            add(l2);
            b.addActionListener(this);
}    public void actionPerformed(ActionEvent e) {
     l2.setText("\n My university name is"+tf.getText());
}}
public class event {
    public static void main(String[] args){
        myframe1 obj=new myframe1();
        obj.setSize(400,400);
        obj.setVisible(true);
    }}
