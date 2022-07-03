/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author abc
 */
class jcheck extends JFrame implements ActionListener {
    JCheckBox c1,c2;
    JRadioButton r1,r2;
    JTextField tf;
    jcheck(){
        super("JCeckBoxDemo");
        tf=new JTextField("I LOVE India",20);
        tf.setBounds(10,20,100,80);
        c1=new JCheckBox("Bold");
        c1.setMnemonic(KeyEvent.VK_B);
        c2=new JCheckBox("Italic");
        c2.setMnemonic(KeyEvent.VK_I);
        r1=new JRadioButton("Lower");
        r2=new JRadioButton("Upper");
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
     r1.setActionCommand("Lower");
     r2.setActionCommand("Upper");
    setLayout(new FlowLayout());
    add(tf);
    add(c1);
    add(c2);
    add(r1);
    add(r2);
    }
    @Override
    public void actionPerformed(ActionEvent ae){

       switch(ae.getActionCommand())
        {
            case "Lower":tf.setText(tf.getText().toLowerCase());
            break;
            case "Upper": tf.setText(tf.getText().toUpperCase());
            break;
        }
       int b=0, i=0;
       if(c1.isSelected())b=Font.BOLD;
       if(c2.isSelected())i=Font.ITALIC;
    Font f=new Font("Times New Roman",b|i,15);
    tf.setFont(f);
    }
}
public class jceheckbox {
    public static void main(String[] arg){
    jcheck obj=new jcheck();
    obj.setSize(400,400);
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
