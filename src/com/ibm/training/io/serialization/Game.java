package com.ibm.training.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Game {
	
	GameData data = new GameData();
	
	public void playGame() {
		if(Math.random() > 0.5) {
			data.setPoints(data.getPoints()+ 2);
		}
		
		data.setLevel(data.getLevel() + 1);
	}

	public void save() {
		try {
			FileOutputStream fout = new FileOutputStream("D:/temp/Nov24/b2/game.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(data);
			oos.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void restore() {
		try {
			FileInputStream fout = new FileInputStream("D:/temp/Nov24/b2/game.ser");
			ObjectInputStream oos = new ObjectInputStream(fout);
			this.data = (GameData) oos.readObject();
			oos.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
