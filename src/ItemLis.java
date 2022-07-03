/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
 <applet code="Itemlis" width=250 height=150>
  </applet>
 
 */
public class ItemLis extends Applet implements ItemListener {
String msg="";
Checkbox Win98,winNT,solaris,mac;

    public void init() {
Win98=new Checkbox("Windows 98/xp",null,true);
winNT=new Checkbox("Windows NT/2000");
solaris=new Checkbox("Soaris");
mac=new Checkbox("MacOS");
add(Win98);
add(winNT);
add(solaris);
add(mac);
Win98.addItemListener(this);
winNT.addItemListener(this);
solaris.addItemListener(this);
mac.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
public void paint(Graphics g){
    msg="Current state:";
    g.drawString(msg,6,80);
    msg="Window 98/xp:"+Win98.getState();
    g.drawString(msg,6,100);
    msg="Windows NT/2000:"+winNT.getState();
    g.drawString(msg,6,120);
    msg="MacOS:"+mac.getState();
    g.drawString(msg,6,160);
    msg="Created by kartik patel"+solaris.getState();
    g.drawString(msg,9,200);
}
}
