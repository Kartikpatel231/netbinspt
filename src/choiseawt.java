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
 class Kartikk extends Frame implements ItemListener,ActionListener {
   List l;
   Choice c;
   TextArea ta;
   Kartikk(){
       super("java_Core_Tricks");
       l=new List(4,true);
       c=new Choice();
       ta=new TextArea(20,30);
       l.add("Monday");
       l.add("Tuesday");
       l.add("Wednesday");
       l.add("Thursday");
       l.add("Friday");
       l.add("Saturday");
       l.add("Sunday");
       
       c.add("Juanuary");
       c.add("February");
       c.add("March");
       c.add("April");
      setLayout(new FlowLayout());
      add(ta);
      add(l);
      add(c);
      l.addItemListener(this);
      c.addItemListener(this);
   }
   public void itemStateChanged(ItemEvent ie){
       if(ie.getSource()==l)
           ta.setText(l.getSelectedItem());
       else
           ta.setText(c.getSelectedItem());
   }
   public void actionPerformed(ActionEvent ae){
       String list[]=l.getSelectedItems();
               String txt="";
               for(String x:list)
                   txt+=x+"\n";
               ta.setText(txt);
   }
}

public class choiseawt{

    public static void main(String[] args){
        Kartikk obj=new Kartikk();
        obj.setSize(300,300);
        obj.setVisible(true);
    }
}
