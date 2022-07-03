/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
/**
 *
 * @author abc
 */
class MYFrame extends Frame implements KeyListener{
    Label l1,l2,l3,l4,l5;
    MYFrame(){
        super("Key Event demo");
        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");
        l5=new Label("");
    
        setLayout(null);
        l1.setBounds(30, 10, 100,20);
        l2.setBounds(30, 40, 100,20);
        l3.setBounds(30, 50, 100,20);
        l4.setBounds(30, 60, 100,20);
        l5.setBounds(30, 70, 100,20);
    
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        
   
       addKeyListener(this);
    }
       public void mouseClicked(MouseEvent e){
        l1.setText("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e){
        l2.setText("Mouse Pressed");
    }
    public void mouseEntered(MouseEvent e){
        l3.setText("Mouse Released");
    }

    @Override
    public void keyTyped(KeyEvent e) {
 
   l3.setText("Key Released");
   l4.setText(new Date(e.getWhen())+"");
    }

    @Override
    public void keyPressed(KeyEvent e) {
       l1.setText("Key Pressed");
       l2.setText("");
    }

    @Override
    public void keyReleased(KeyEvent e) {
    l2.setText("KeyReleased");
    l1.setText("");
    l3.setText("");
    l4.setText("");
    
    }
}
public class Buttons {
public static void main(String[] args){
    MYFrame obj=new MYFrame();
    obj.setSize(300, 300);
    obj.setVisible(true);
}    
}
