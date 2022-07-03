/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
import java.io.*;
import java.util.StringTokenizer;
/**
 *
 * @author abc
 */
class borders extends JFrame{
    JTree tree;
    JLabel labal;
    borders(){
        super("Tree Demo");
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:");
        File f=new File("C:");
        for(File x: f.listFiles()){
        
           if(x.isDirectory()){
 DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
for(File Y:x.listFiles()){
    temp.add(new DefaultMutableTreeNode(x.getName()));
}
           
           root.add(temp);
           }
           else
            root.add(new DefaultMutableTreeNode(x.getName()));
        }
        tree=new JTree(root);
        labal=new JLabel("No file selected");
        add(tree,BorderLayout.CENTER);
        add(labal,BorderLayout.CENTER);
    }
}
public class border {
    public static void main(String[] args){
        borders of=new borders();
        of.setSize(400,400);
        of.setVisible(true);
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
