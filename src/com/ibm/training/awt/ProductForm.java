package com.ibm.training.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.ibm.training.jdbc.Product;
import com.ibm.training.jdbc.ProductDAO;

public class ProductForm extends WindowAdapter implements ActionListener{
	
	Frame frame = new Frame("Product App v1.0");
	
	Label lblName = new Label("Prd Name");
	Label lblPrice = new Label("Prd Price");
	Label lblQoh = new Label("Prd QoH");
	Label lblMsg = new Label("                  ");
	
	TextField txtName = new TextField(20);
	TextField txtPrice = new TextField(20);
	TextField txtQoh = new TextField(20);
	
	Button btnOK = new Button("Save Data");
	Button btnCancel = new Button("Clear Form");
	
	public ProductForm() {
		frame.setSize(300, 300);
		frame.setLocation(250, 300);
		
		frame.setLayout(new FlowLayout());
		frame.add(lblName); frame.add(txtName);
		frame.add(lblPrice); frame.add(txtPrice);
		frame.add(lblQoh); frame.add(txtQoh);
		frame.add(btnCancel); frame.add(btnOK);
		frame.add(lblMsg);
		
		frame.addWindowListener(this);
		btnOK.addActionListener(this);
		btnCancel.addActionListener(this);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ProductForm();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		if(e.getSource() == btnCancel) {
			resetFormBlank();
			
		}else if(e.getSource() == btnOK) {
			String name = txtName.getText();
			float price = 0;
			try {
				price = Float.parseFloat(txtPrice.getText());
			}catch (NumberFormatException ex) {
				lblMsg.setText("Please enter a numeric value for price");
				txtPrice.setForeground(Color.RED);
				return;
			}
			
			int qoh = 0;
			try {
				qoh = Integer.parseInt(txtQoh.getText());
			}catch (NumberFormatException ex) {
				lblMsg.setText("Please enter a numeric value for qoh");
				txtQoh.setForeground(Color.RED);
				return;
			}
			
			Product toBesaved = new Product(name, price, qoh);
			ProductDAO dao = new ProductDAO();
			dao.save(toBesaved);
			lblMsg.setText("Product Saved!");
			
			resetFormBlank();
		}
		
	}

	private void resetFormBlank() {
		txtName.setText("");
		txtPrice.setText("");
		txtQoh.setText("");
		txtName.setForeground(Color.BLACK);
		txtPrice.setForeground(Color.BLACK);
		txtQoh.setForeground(Color.BLACK);
		
	}
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Bye!");
		System.exit(0);
	}

}
