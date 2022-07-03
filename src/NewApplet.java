/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
 <applet code="addnum" width=250 height=150>
 </applet>
 */
public class NewApplet extends Applet  implements ActionListener {
    TextField num1,num2,ans;
    Button add,multi,clr;
    Label n1,n2,a;
    String msg;
  
    public void init()
    {
        msg="created by kartik patel";
       setBackground(Color.green);
        setForeground(Color.black);
        setLayout(null);
        n1=new Label("Number1");
        num1=new TextField(12);
        n2=new Label("Number2");
        num2=new TextField(12);
        a=new Label("Answer=");
        ans=new TextField(12);
        add=new Button("Add");
        multi=new Button("Multi");
        clr=new Button("Clear");
        add(n1);
        add(num1);
        add(n2);
        add(num2);
        add(ans);
        add(a);
        add(add);
        add(multi);
        add(clr);
        n1.setBounds(20,20,60,40);
        num1.setBounds(80,20,60,40);
        n2.setBounds(20,80,60,40);
        num2.setBounds(80,80,60,40);
        a.setBounds(20,150,60,40);
        ans.setBounds(80,150,60,40);
        add.setBounds(40,200,60,40);
        multi.setBounds(110,200,60,40);
        clr.setBounds(20,250,60,40);
        add.addActionListener(this);
        multi.addActionListener(this);
        clr.addActionListener(this);
        
    }
public void actionPerformed(ActionEvent ae)
{
    String str=ae.getActionCommand();
    int a=Integer.parseInt(num1.getText());
    int b=Integer.parseInt(num2.getText());
    if(str.equals("Add")){
        int c=a+b;
        ans.setText((Integer.toString(c)));
        
    }
    else if(str.equals("Multi")){
        int c=a*b;
        ans.setText((Integer.toString(c)));
        
    }
    else{
        num1.setText(" ");
        num2.setText(" ");
        ans.setText(" ");
    }
}

  
}



   
