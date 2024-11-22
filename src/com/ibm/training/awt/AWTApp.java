package com.ibm.training.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTApp extends WindowAdapter{ // implements ActionListener
	
	Frame frame = new Frame("My AWT UI App v1.0");
	Label lblName = new Label("Name");
	TextField txtName = new TextField(20);
	Button btnOK = new Button("OK");
	Label lblMessage = new Label("            ");
	
	public AWTApp() {
		frame.setSize(300, 250);
		frame.setLocation(450, 300);
		
		frame.setLayout(new FlowLayout());
		
		frame.add(lblName);
		frame.add(txtName);
		frame.add(btnOK);
		frame.add(lblMessage);
		
		frame.setVisible(true);
		
		frame.addWindowListener(this);
		txtName.addMouseListener(new DhinchakColorChanger());
		//btnOK.addActionListener(this);
		btnOK.addActionListener(e -> lblMessage.setText(txtName.getText()));
	}
	public static void main(String[] args) {
		new AWTApp();
		
	}
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Bye!");
		System.exit(0);
	}
	
	
	public class DhinchakColorChanger extends MouseAdapter{

		@Override
		public void mouseEntered(MouseEvent e) {
			txtName.setBackground(Color.MAGENTA);
			txtName.setForeground(Color.WHITE);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			txtName.setBackground(Color.WHITE);
			txtName.setForeground(Color.BLACK);
		}
	}


	/*
	 * @Override public void actionPerformed(ActionEvent e) { String text =
	 * txtName.getText(); lblMessage.setText(text); }
	 */

	

}
