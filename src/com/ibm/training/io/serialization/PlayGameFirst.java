package com.ibm.training.io.serialization;

public class PlayGameFirst {

	public static void main(String[] args) {
		Game game = new Game();
		
		game.playGame();
		
		System.out.println(" in between playing ... now about to save game...");
		System.out.println(game.data);
		
		game.save();

	}

}
