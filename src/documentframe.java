/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author abc
 */
class MyInternalFrame extends JInternalFrame {

    static int count = 0;
    JTextArea ta;
    JScrollPane sp;

    MyInternalFrame() {
        super("Document" + (++count), true, true, true, true);
        ta = new JTextArea();
        sp = new JScrollPane(ta);
        add(sp);
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");
        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);
        setSize(400, 300);
        setLocation(50, 50);
        setVisible(true);
    }
}

class MyDocument extends JFrame implements ActionListener {

    JDesktopPane jp;

    MyDocument() {
        super("Internal Frame Demo");
        jp = new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("New");
        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);
        m1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyInternalFrame m1 = new MyInternalFrame();
        jp.add(m1);
    }
}

public class documentframe {

    public static void main(String[] ar) {
        MyDocument obj = new MyDocument();
        obj.setSize(400, 400);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
