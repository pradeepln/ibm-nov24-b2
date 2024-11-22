package com.ibm.training.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.ibm.training.jdbc.Product;
import com.ibm.training.jdbc.ProductDAO;

public class ProductFormApp implements ActionListener, ItemListener{
	
	JFrame frame = new JFrame("Product Swing App v7.1");
	
	JLabel lblName = new JLabel("Prd Name");
	JLabel lblPrice = new JLabel("Prd Price");
	JLabel lblQoh = new JLabel("Prd QoH");
	JLabel lblMsg = new JLabel("                        ");
	
	JTextField txtName = new JTextField(20);
	JTextField txtPrice = new JTextField(20);
	JTextField txtQoh = new JTextField(20);
	
	JButton btnOK = new JButton("Save Data");
	JButton btnCancel = new JButton("Clear Form");
	
	JComboBox<String> looks; 
	public ProductFormApp() {
		looks = new JComboBox<String>(new String[]{"Metal","Motif","Windows","Nimbus","Gtk"});
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		panel.add(lblName); panel.add(txtName);
		panel.add(lblPrice); panel.add(txtPrice);
		panel.add(lblQoh); panel.add(txtQoh);
		panel.add(btnOK);
		panel.add(btnCancel);
		panel.add(lblMsg);
		panel.add(looks);
		
		frame.setContentPane(panel);
		
		//events
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		btnOK.addActionListener(this);
		btnCancel.addActionListener(this);
		looks.addItemListener(this);
		
		frame.setSize(350, 300);
		frame.setLocation(250, 250);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ProductFormApp();

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
	public void itemStateChanged(ItemEvent e) {
		String look = (String) e.getItem();
		
		try {
			switch (look) {
				case "Metal":
					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
					SwingUtilities.updateComponentTreeUI(frame);
					break;
				case "Windows":
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					SwingUtilities.updateComponentTreeUI(frame);
					break;
				case "Motif":
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					SwingUtilities.updateComponentTreeUI(frame);
					break;
				case "Nimbus":
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					SwingUtilities.updateComponentTreeUI(frame);
					break;
				case "Gtk":
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
					SwingUtilities.updateComponentTreeUI(frame);
					break;
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
