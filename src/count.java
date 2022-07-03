/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
/**
 *Simple Program for increasing count value in AWT
 * @author Kartik Patel
 */
   class count1 extends Frame implements ActionListener{
   int count=0;
   Label l;
   TextField ta;
   Button Press;
   count1()
   {
        super("Java_Core_Trick");
        l=new Label("Count");
        ta=new TextField("0",23);
        Press=new Button("press");
        setLayout(new FlowLayout());
        add(l);
        add(ta);
        add(Press);
        Press.addActionListener(this);
    }
    

    
   
public void actionPerformed(ActionEvent e) {
        count++;
        ta.setText(" "+count);
    }
  
    }
    public class count {
    public static void main(String[] arg){
                  count1 ob=new count1();    
                  ob.setSize(400,400);
                  ob.setVisible(true);
}
}