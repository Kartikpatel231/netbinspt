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
class kartik extends Frame implements ItemListener,TextListener,ActionListener{
   //Label l;
Checkbox c1,c2,c3;
CheckboxGroup gre;
TextArea ta;

Button x;
         Label f,m,n,o,p;
    TextField l1,m1,n1,o1;

    public  kartik(){
       
        super("SVVV Login Page ");
        f=new Label("User name");
        l1=new TextField(20);
        m=new Label("Last name");
                m1=new TextField(20);

        n=new Label("Date of birth ");
                n1=new TextField(20);

        p=new Label("Gender ");
        gre=new CheckboxGroup();
        c1=new Checkbox("Male",false,gre);
        c2=new Checkbox("Female",false,gre);
        c3=new Checkbox("Other",false,gre);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        o=new Label("Password");
                o1=new TextField(20);
                o1.setEchoChar('*');
                o1.addTextListener(this);
                m1.addTextListener(this);
                n1.addTextListener(this);
//                l.addTextListener(this);
                l1.addTextListener(this);
                  ta=new TextArea(10,30);

        x=new Button("Login");
        x.addActionListener(this);
       setLayout(new FlowLayout());
       
       add(f);
       add(l1);
       add(m);
       add(m1);
       add(n);
       add(n1);
       add(p);
      
       add(c1);
       add(c2);
       add(c3);
       add(o);
       add(o1);
       add(ta);
       add(x);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    String p1=" ";
    if(c1.getState())
        p1=p1+" "+c1.getLabel();
   if(c2.getState());
        p1=p1+" "+c2.getLabel();
        if(c3.getState())
            p1=p1+" "+c3.getLabel();
        if(p1.isEmpty())
            p1="Nothing is selected";
        //l.setText(p1);
    }
    public void actionPerformed(ActionEvent ae){
    
    
 //o.setText(o1.getText());
 ta.append(l1.getText());  
 l1.getText();
 ta.append(m1.getText());  
 ta.append(n1.getText());  
 //ta.append(p1.getText());  
 ta.append(o1.getText());
ta.setText(gre.getSelectedCheckbox().getLabel());
}
    public void textValueChanged(TextEvent te){
       // o.setText(o1.getText());
    }
}
public class firstapp {
    public static void main(String[] args){
       kartik f=new kartik();
        f.setSize(300,300);
        f.setVisible(true);
          
 }
}
