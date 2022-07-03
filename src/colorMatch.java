/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author abc
 */
class color extends Frame implements AdjustmentListener{
    Scrollbar red,blue,green;
    TextField tf;
    color(){
        super("java_Core_Trics");
        red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
   tf=new TextField(20);
   tf.setBounds(50, 100, 300, 50);
   red.setBounds(50,150,300,30);
   blue.setBounds(50,250,300,30);
   green.setBounds(50,350,300,30);
    setLayout(null);
    add(tf);
    add(red);
    add(blue);
    add(green);
    red.addAdjustmentListener(this);
    blue.addAdjustmentListener(this);
    green.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
    tf.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));
    }
}
public class colorMatch {
    public static void main(String[] args){
    color obj=new color();
    obj.setSize(300,300);
    obj.setVisible(true);
    }
}
