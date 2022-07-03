/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author abc
 */
class MySplit extends JFrame implements ListSelectionListener{
    JSplitPane sp;
    JList list;
    JLabel lb;
    JLabel l;
    MySplit(){
        super("Split Demo");
        String cols[]={"Red","Green","Blue","Yellow","Magenta","Orange","Black"};
       list =new JList(cols);
       list.setSelectedIndex(0);
       list.addListSelectionListener(this);
       JScrollPane p1=new JScrollPane(list);
       lb=new JLabel(" ");
       lb.setOpaque(true);
       lb.setBackground(Color.red);
       JScrollPane p2=new JScrollPane(lb);
       sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
       sp.setDividerLocation(200);
     //  JTabbedPane tp=new JTabbedPane();
    //   tp.addTab("Colors",p1);
      // tp.addTab("Label",p2);
       add(sp);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
String str=(String)list.getSelectedValue();
   switch(str){
       case "Red": lb.setBackground(Color.red);
           break;
       case "Green": lb.setBackground(Color.green);
           break;
       case "Blue": lb.setBackground(Color.blue);
           break;
       case "Yellow": lb.setBackground(Color.yellow);
           break;
       case "Magenta": lb.setBackground(Color.magenta);
           break;
       case "Orange": lb.setBackground(Color.orange);
           break;
       case "Black": lb.setBackground(Color.black);
           break;
   }
    }
}
public class splitProgram {
    public static void main(String[] ar){
        MySplit obj=new MySplit();
        obj.setSize(500,500);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
