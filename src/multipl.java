/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abc
 */
mport java.awt.*;
import java.awt.event.*;
Import java.swing.event.*;
Import java.swing.*;
 
class kartik implements ActionListener
	{
			Frame f=new Frame("Kartik patel");
			
			Label l1=new Label("Name");
			Label l2=new Label("First Number");
			Label l3=new Label("Second Number");
			Label l4=new Label("Result");
			
			
			TextField t1=new TextField();
			TextField t2=new TextField();
			TextField t3=new TextField();
			TextField t4=new TextField();
			
			Button b=new Button("  *  ");
			
	Kartik()
				{
					l1.setBounds(50,100,120,20);
					l2.setBounds(50,140,100,20);
					l3.setBounds(50,180,100,20);
					l4.setBounds(50,220,100,20);
					
					t1.setBounds(200,100,100,20);
					t2.setBounds(200,140,100,20);
					t3.setBounds(200,180,100,20);
					t4.setBounds(200,220,100,20);
					
					b.setBounds(170,250,50,20);
					



						f.add(l1);
						f.add(l2);
						f.add(l3);
						f.add(l4);
						
						f.add(t1);
						f.add(t2);
						f.add(t3);
						f.add(t4);
						
						
						f.add(b);


						b.addActionListener(this);
						

					f.setLayout(null);
					f.setVisible(true);
					f.setSize(500,500);
			  }
			  
		public void actionPerformed(ActionEvent e)
											{
												int n1=Integer.parseInt(t2.getText());
												int n2=Integer.parseInt(t3.getText());
												if(e.getSource()==b)
													{
														t1.setText(" Kartik patel");
														t4.setText(String.valueOf(n1*n2));
													}
										 }
		public static void main(String[] args)
									{
										new Kartik();	
									}
	}

