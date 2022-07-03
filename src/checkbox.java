/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class myframe extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup gre;
    public myframe(){
        super("Java_Core_Tricks");
        l=new Label("Nothing is selected");
        gre=new CheckboxGroup();
        c1=new Checkbox("Java",false,gre);
        c2=new Checkbox("Phyton",false,gre);
        c3=new Checkbox("c#",false,gre);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
   setLayout(new FlowLayout());
   add(l);
   add(c1);
   add(c2);
   add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
String str="";
    if(c1.getState())
    str=str+" "+c1.getLabel();
    if(c2.getState())
    str=str+" "+c2.getLabel();
    if(c3.getState())
    str=str+" "+c3.getLabel();
    if(str.isEmpty())
        str="Nothing is selected";
    l.setText(str);
    }
}
public class checkbox {
public static void main(String[] args){
    myframe obj=new myframe();
    obj.setSize(400,400);
    obj.setVisible(true);
}    
}
