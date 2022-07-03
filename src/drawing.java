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
class myFramess extends Frame{
    int x,y;
    myFramess(){
        super("Painting");
        addMouseMotionListener(new MouseAdapter(){//Motion
            public void mouseMoved(MouseEvent me){//Clicked
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });
        }
    public void paint(Graphics g){
        g.setColor(Color.red);
        //g.drawOval(x,y,50,50);
        g.setFont(new Font("Times New Roman",Font.BOLD,30));
      g.drawString("KartikPatel",x, y);
    }
}
public class drawing {
    public static void main(String[] args){
        myFramess obj=new myFramess();
        obj.setSize(400,400);
        obj.setVisible(true);
    }
}
