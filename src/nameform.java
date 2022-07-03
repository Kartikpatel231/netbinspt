    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
 *Login page in AWT
 * @author Kartik
 */
class Myframe extends Frame implements ActionListener{
    Label name,lastName,Password;
    TextField l1,m1,n1;
    Button b;
    TextArea all;
    public Myframe(){
        super("Java_Core awt program");
       name=new Label("First name");
       l1=new TextField("\n",20);
       l1.setBounds(40, 60, 70, 80);
       
       lastName=new Label("Last name");
       m1=new TextField("\n",20);
       l1.setBounds(40, 60, 70, 80);
          
       Password=new Label("Password ");
       n1=new TextField("\n",20);
       n1.setEchoChar('*');
       l1.setBounds(40, 60, 70, 80);
       all=new TextArea(10,40);
       b=new Button("Login");
     
       setLayout(new FlowLayout());
       add(name);
       add(l1);
       add(lastName);
       add(m1);
       add(Password);
       add(n1);
       add(b);
       add(all);

    b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
    all.append("\n"+l1.getText());
    all.append("\n"+m1.getText());
    all.append("\n"+n1.getText());
    }
}
public class nameform {

public static void main(String[] args){
    Myframe obj=new Myframe();
    obj.setSize(400,400);
    obj.setVisible(true);
}    
}

    
