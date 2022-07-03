/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author abc
 */
class menuis extends JFrame implements ActionListener{
JToolBar tb;
JButton b1,b2,b3,b4,b5,b6,b7;
JTextArea ta;
menuis(){
    super("Toolbar");
    tb=new JToolBar();
    b1=new JButton(new ImageIcon("C://Users/abc/Documents/NetBeansProjects/JavaApplication3/src/image/2.png"));
    b2=new JButton(new ImageIcon("C://Users/abc/Documents/NetBeansProjects/JavaApplication3/src/image/1.png"));
    b3=new JButton(new ImageIcon("C://Users/abc/Documents/NetBeansProjects/JavaApplication3/src/image/3.png"));
    b4=new JButton(new ImageIcon("C://Users/abc/Documents/NetBeansProjects/JavaApplication3/src/image/4.png"));
    b5=new JButton(new ImageIcon("C://Users/abc/Documents/NetBeansProjects/JavaApplication3/src/image/5.png"));
    b6=new JButton(new ImageIcon("C://Users/abc/Documents/NetBeansProjects/JavaApplication3/src/image/1.png"));
    b7=new JButton(new ImageIcon("C://Users/abc/Documents/NetBeansProjects/JavaApplication3/src/image/3.png"));
    tb.add(b1);
    tb.add(b2);
    tb.add(b3);
    tb.add(new JToolBar.Separator());
    tb.add(b4);
    tb.add(b5);
    tb.add(b6);
    tb.add(b7);
    ta=new JTextArea();
    JScrollPane sp=new JScrollPane(ta);
    add(tb,BorderLayout.NORTH);
    JMenuBar mb=new JMenuBar();
    JMenu file=new JMenu("File");
    JMenuItem m1=new JMenuItem("save");
    JMenuItem m2=new JMenuItem("open");
    m2.setMnemonic(KeyEvent.VK_0);
    file.add(m1);
    file.addSeparator();
    file.add(m2);
    mb.add(file);
    setJMenuBar(mb);
    b2.setActionCommand("open");
    b2.addActionListener(this);
    m2.addActionListener(this);
    b1.addActionListener(this);
    m1.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("open")){
            
        
        JFileChooser ob=new JFileChooser();
        ob.showOpenDialog(this);
        File f=ob.getSelectedFile();
        try{
          FileInputStream fi=new FileInputStream(f);
          byte b[]=new byte[fi.available()];
            fi.read(b);
            String str=new String(b);
            ta.setText(str);
            fi.close();
    
        }
        catch(Exception e){}
        }
        
        else{
 Color col =   JColorChooser.showDialog(this, "Font Color", Color.red);
    ta.setForeground(col);
}
    }
    }

public class jmenubar {
    public static void main(String[] args){
    menuis obj=new menuis();
    obj.setSize(900,900);
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
