/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;


/**
 *
 * @author abc
 */
class Myframe extends JFrame implements ActionListener{
    JLabel N,L,G,D,P,C;
    JTextField N1,L1,G1,D1,P1,C1;
    JTextArea ta;

    JRadioButton M,F,O;
    JButton B;
    
    ButtonGroup buttonGroup=new ButtonGroup();
     ButtonGroup bg;
     
    Myframe(){
        super("Login Page Created by kartik");
        N=new JLabel("FistName");
        N1=new JTextField(20);

       L=new JLabel("LastName");
       L1=new JTextField(20);
       
       G=new JLabel("Gender");
       M=new JRadioButton("Male");
       F=new JRadioButton("Female");
       O=new JRadioButton("Other");

      bg=new ButtonGroup();
       bg.add(F);bg.add(O);
       
       D=new JLabel("Date_Of_Birth");
       D1=new JTextField(20);

       P=new JLabel("Create_Password");
       P1=new JTextField(20);
        //P1.setEchoChar('*');
        
       

       C=new JLabel("Confim_Password");
       C1=new JTextField(20);
      
       B=new JButton("Singup");
       
       ta=new JTextArea(80,80);
   Border br=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
      B.setBorder(br);
      
      setLayout(new FlowLayout());
     
       add(N);
       add(N1);
       add(L);
       add(L1);
       add(G);
        add(M);
        add(F);
        add(O);      
              

       add(D);
       add(D1);
       add(P);
       add(P1);
       add(C);
       add(C1);
       add(B);
       add(ta);
       
    
    
    //   M.addActionListener(this);
       //F.addActionListener(this);
       //O.addActionListener(this);
       B.addActionListener(this);
       M.setActionCommand("Male");
       F.setActionCommand("Female");
       O.setActionCommand("Other");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

           switch(e.getActionCommand()){
            case "Male":ta.setText(M.getText());
                break;
            case "Female":ta.setText(F.getText());
                break;
            case "Other":ta.setText(O.getText());
                break;
        }
        ta.insert(N1.getText(), ta.getCaretPosition());
        ta.append(L1.getText());
          ta.append(D1.getText());
        ta.append(P1.getText());
        ta.append(C1.getText());
      
    }

   
}
public class loginpageinswing {
    public static void main(String[] arg){
        Myframe obj=new Myframe();
        obj.setSize(500,500);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
