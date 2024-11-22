package com.ibm.training.awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NotePadApp extends Frame implements ActionListener{

	TextArea fileContents = new TextArea();
	
	public NotePadApp() {
		super("Untitled - "+"MyOwnNotepad v1.1");
		super.add(fileContents);
		
		MenuBar menuBar = new MenuBar();
		Menu fileMenu = new Menu("File");
		Menu editMenu = new Menu("Edit");
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		fileMenu.add(new MenuItem("New"));
		fileMenu.add(new MenuItem("Open"));
		fileMenu.add(new MenuItem("Save"));
		fileMenu.addSeparator();
		fileMenu.add(new MenuItem("Exit"));
		editMenu.add(new MenuItem("Copy"));
		editMenu.add(new MenuItem("Cut"));
		editMenu.add(new MenuItem("Paste"));
		
		super.setMenuBar(menuBar);
		
		//events
		super.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		fileMenu.addActionListener(this);
		editMenu.addActionListener(this);
		
		
		super.setSize(400, 400);
		super.setLocation(250, 250);
		super.setVisible(true);
	}
	public static void main(String[] args) {
		NotePadApp app = new NotePadApp();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Open")) {
			FileDialog fd = new FileDialog(this,"Select File",FileDialog.LOAD);
			fd.setVisible(true);
			String dir = fd.getDirectory();
			String file = fd.getFile();
			setTitle(file+" - MyOwnNotepad v1.1");
			try {
				FileReader fr = new FileReader(dir+file);
				BufferedReader br = new BufferedReader(fr);
				String line;
				while((line = br.readLine()) != null) {
					fileContents.append(line+"\n");
				}
				br.close();
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}else if(cmd.equals("Exit")) {
			System.exit(0);
		}
	}
}
