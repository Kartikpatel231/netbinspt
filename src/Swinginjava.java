/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import javax.swing.UIManager.*;
import java.awt.*;
import javax.swing.JFrame;
/**
 *Simple menu program in Swing
 * @author Kartik
 */
class swing extends JFrame {
  swing(){
      JTextField tf=new JTextField(20);
      JButton b=new JButton("click");
      setLayout(new FlowLayout());
      add(tf);
      add(b);
      JMenuBar mb=new JMenuBar();
      JMenu file=new JMenu("File");
      JMenuItem o=new JMenuItem("Open");
      JMenuItem c=new JMenuItem("Close");
      JMenuItem d=new JMenuItem("svae");
      JMenuItem e=new JMenuItem("SaveAS");
      JMenuItem f=new JMenuItem("Paint");
      file.add(o);
      file.add(c);
      file.add(d);
      file.add(e);
      file.add(f);
      mb.add(file);
      setJMenuBar(mb);
  } }
public class Swinginjava {
public static void main(String[] args){
    swing f=new swing();
    LookAndFeelInfo[] plafs=UIManager.getInstalledLookAndFeels();
    for(LookAndFeelInfo info:plafs){
        System.out.println(info.getName());
    }
    f.setSize(400,300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    System.out.println(UIManager.getLookAndFeel());
} }
