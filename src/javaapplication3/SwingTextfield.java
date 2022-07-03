/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Locale;
import javax.swing.text.NumberFormatter;
/**
 *
 * @author abc
 */
class Myframe extends JFrame{
    Myframe(){
        JTextField tf1=new JTextField(15);
        DateFormat df=new SimpleDateFormat("dd/MMMM//YYYY");
        JFormattedTextField tf2=new JFormattedTextField(df);
        tf2.setColumns(15);
        tf2.setValue(0);
     NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
     NumberFormatter nf1=new NumberFormatter(nf);
     nf1.setAllowsInvalid(false);
     nf1.setMaximum(10000);
        JFormattedTextField tf3=new JFormattedTextField(nf1);
        tf3.setColumns(15);
        tf3.setValue(0);
JTextArea ta=new JTextArea(30,30);
ta.setText(null);
        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);
    }
}
public class SwingTextfield {
    public static void main(String[] args){
    Myframe obj=new Myframe();
    obj.setSize(500,500);
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
