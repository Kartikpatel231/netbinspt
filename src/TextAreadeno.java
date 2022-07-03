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
class MyFrame extends Frame implements ActionListener{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    MyFrame(){
        super("Jave_Core_Tricks");
        l=new Label("No Text enter yet");
        ta=new TextArea(10,30);
        tf=new TextField(20);
        b=new Button("Click");
        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
ta.insert(tf.getText(), ta.getCaretPosition());
        //ta.append(tf.getText());    }
}
}
public class TextAreadeno {
    public static void main(String[] args){
        MyFrame obj=new MyFrame();
        obj.setSize(400,400);
        obj.setVisible(true);
    }
}
