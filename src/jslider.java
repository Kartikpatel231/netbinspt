/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
/**
 *
 * @author abc
 */
class myFrame extends JFrame implements ChangeListener{
    JSlider sl;
    JPanel p1,p2;
    JProgressBar pb;
    int w=50;
    myFrame(){
        sl=new JSlider(0,100,50);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(1);
        sl.setPaintTicks(true);
      //  sl.setPaintLabels(true);
        
        pb=new JProgressBar();
        pb.setString("50%");
        pb.setStringPainted(false);
        pb.setIndeterminate(true);
        p1=new JPanel(){
            public void paintComponent(Graphics g){
                g.drawOval(200, 200, w, w);
            }
        } ;
    p2=new JPanel();
    p2.add(pb);
    add(sl,BorderLayout.NORTH);
    add(p1,BorderLayout.CENTER);
    add(p2,BorderLayout.SOUTH);
    sl.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        w=sl.getValue();
        p1.repaint();
        pb.setString(w+" ");
       pb.setStringPainted(true);
       pb.setValue(w);
    }
}
public class jslider  {
    public static void main(String[] ar){
        myFrame f=new myFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}