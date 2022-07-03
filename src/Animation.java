/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
//import java.awt.event.*;

/**
 *
 * @author abc
 */
class Myframess extends Frame implements Runnable{
    int x,y,tx,ty;
    Myframess(){
        super("Animation Demo");
      x=100;
      y=100;
      tx=ty=1;
      Thread t=new Thread(this);
      t.start();
    }
        
  public void paint(Graphics g){
      g.setColor(Color.red);      
      g.fillOval(x, y, 50, 50);
            
  }
  public void run() {
  while(true){
      x+=tx;
      y+=ty;
      if(x<0||x>450)
          tx=tx*-1;
      if(y<20||y>350)
          ty=ty*-1;
      repaint();
      try{Thread.sleep(5);}
      catch(Exception e){}
  
  }
    }
}

public class Animation {
    public static void main(String[] args){
        Myframess obj=new Myframess();
        obj.setSize(500,400);
        obj.setVisible(true);
    }
}
