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
class Myframes extends Frame implements ActionListener,ItemListener{
    Menu File,Sub;
    MenuItem Open,Save,SaveAll,Close,Edit;
    CheckboxMenuItem auto;
    TextField tf;
    Myframes(){
        super("Intagram java cover Tricks");
        Open=new MenuItem("Open");
        Save=new MenuItem("Save");
        SaveAll=new MenuItem("SaveAll");
        Close=new MenuItem("Close");
        Edit=new MenuItem("Edit");
        auto=new CheckboxMenuItem("Auto Save");
        File=new Menu("File");
        Sub=new Menu("Edit");
        File.add(Open);
        File.add(Save);
        File.add(SaveAll);
        File.add(Close);
        File.add(Edit);
        Sub.add(Save);
       Sub.add(SaveAll);
        MenuBar mb=new MenuBar();
        mb.add(File);
        mb.add(Sub);
        setMenuBar(mb);
 
        tf=new TextField(20);
        setLayout(new FlowLayout());
        add(tf);
        Open.addActionListener(this);
        Save.addActionListener(this);
        SaveAll.addActionListener(this);
        Close.addActionListener(this);
         auto.addItemListener(this);        
    
    }
    public void actionPerformed(ActionEvent e) {
        tf.setText("Open");
        tf.setText("Save");
        tf.setText("SaveAll");
        tf.setText("Edit");
        tf.setText("Close");
        
        
    }
    public void itemStateChanged(ItemEvent e) {
if(auto.getState())
    tf.setText("Auto on");
else
    tf.setText("Auto");

    }
}
public class menu {
    public static void main(String[] args){
    Myframes obj=new Myframes();
    obj.setSize(300,350);
    obj.setVisible(true);
    }
}
