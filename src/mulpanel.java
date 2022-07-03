/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
/**
 *Simple panel Program in Java Swing
 * @author Kartik Patel
 */
class SwingSample extends JFrame{
    JComboBox cb,cb1,cb2,cb3;
    JPanel pn,pn1,pn2,pn3;
    JLabel lb,lb1,lb2,lb3;
    SwingSample(){
        super("kartik patel");
    Border blueBorder=BorderFactory.createLineBorder(Color.BLUE,3); 
    Border blackBorder=BorderFactory.createLineBorder(Color.BLACK,3);
    Border border4=new CompoundBorder(blackBorder,blueBorder);
    String Doctors[]={"Newrologist","Cardiologist","Dermatologist","Rheumatologist","Orthopedic","Optometrist"};
    cb=new JComboBox(Doctors);
    
    String Musicinstruction[]={"Piano","Mandolin","Guitars","Percussions"};
    cb1=new JComboBox(Musicinstruction);
    
    String ProgrammingLanguage[]={"Java","Python","R","C++"};
    cb2=new JComboBox(ProgrammingLanguage);

    String Institution[]={"SVIIT","SVITS","SVITT","SVIM"};
    cb3=new JComboBox(Institution);
    
    pn=new JPanel();
    pn1=new JPanel();
    pn2=new JPanel();
    pn3=new JPanel();
  
    lb=new JLabel("Panel 1");
    lb1=new JLabel("Panel 2");
    lb2=new JLabel("Panel 3");
    lb3=new JLabel("Panel 4");
    setLayout(new FlowLayout());
    pn.add(lb);
    pn1.add(lb1);
    pn2.add(lb2);
    pn3.add(lb3);
    
    pn.add(cb);
    pn1.add(cb1);
    pn2.add(cb2);
    pn3.add(cb3);
    
    pn.setBackground(Color.lightGray);
    pn1.setBackground(Color.ORANGE);
    pn2.setBackground(Color.YELLOW);
    pn3.setBackground(Color.RED);
    
    pn.setBorder(border4);
    pn1.setBorder(border4);
    pn2.setBorder(border4);
    pn3.setBorder(border4);
    
    add(pn);
    add(pn1);
    add(pn2);
    add(pn3);
    }
    }

public class mulpanel {
    public static void main(String[] args){
        SwingSample obj=new SwingSample();
        obj.setSize(500,500);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
