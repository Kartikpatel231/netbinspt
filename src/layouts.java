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
class layout extends Frame{
   Button l1,l2,l3,l4,l5;
   
   public layout(){
        super("java_core_tricks");
     setLayout(new GridLayout(4,1));
          
   l1=new Button("one");
   l2=new Button("Two");
   l3=new Button("Three");
   l4=new Button("Four");
   l5=new Button("Five");
   
   add(l1);
   add(l2);
   add(l3);
   add(l4);
   add(l5);
   //FlowLayout fl=new FlowLayout();
   //fl.setAlignment(FlowLayout.RIGHT);
 //  setLayout(fl);
   /*add(l1,BorderLayout.NORTH);
   add(l2,BorderLayout.EAST);
   add(l3,BorderLayout.SOUTH);
   add(l4,BorderLayout.WEST);
   add(l5,BorderLayout.CENTER);
   Panel p=new Panel();*/
//      setLayout(new GridLayout(4,1));

   /*p.add(new Button("Monday"));
   p.add(new Button("Tuesday"));
   p.add(new Button("Wednesday"));
   p.add(new Button("Friday"));
   add(p,BorderLayout.CENTER);*/
   }
    
}
public class layouts {
 public static void main(String[] args){
     layout obj=new layout();
     obj.setSize(400,400);
     obj.setVisible(true);
 }   
}
