/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author abc
 */
class myframe extends JFrame implements ActionListener,ListSelectionListener,ChangeListener{
    JComboBox cb;
    JList list;
    JSpinner sp1,sp2;
    JTextField tf;
    myframe(){
        super("Spinner Demo");
        String countries[]={"India","Us","Uk","Canada","Australia"};
        String months[]={"January","February","March","April","May","June","july","August","September","Octomber","Number","december"};
        String days[]={"Monda","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        cb=new JComboBox(countries);
        list=new JList(months);
        list.setVisibleRowCount(5);
        tf=new JTextField(15);
        
        sp1=new JSpinner(new SpinnerNumberModel(1,1,31,1));
        sp2=new JSpinner(new SpinnerListModel(days));
        sp2.setBounds(10,30,80,100);
        
        setLayout(new FlowLayout());
        add(cb);
        add(sp1);
        add(sp2);
        add(new JScrollPane(list));
        add(tf);
        cb.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
    }

    public void actionPerformed(ActionEvent e) {
tf.setText((String)cb.getSelectedItem());
    }

    public void valueChanged(ListSelectionEvent e) {
  tf.setText((String)list.getSelectedValue());
    }

    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==sp1)
        tf.setText(sp1.getValue()+"");
        else
        tf.setText((String)sp2.getValue()+"");

            }
}
public class spiner {
public static void main(String[] ar){
    myframe obj=new myframe();
    obj.setSize(600,600);
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}    
}
