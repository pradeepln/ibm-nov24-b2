package com.ibm.training.io.serialization;

public class ResumeGameLater {

	public static void main(String[] args) {
		Game game = new Game();
		
		System.out.println("Before restoring :");
		System.out.println(game.data);
		
		game.restore();
		
		System.out.println("After restoring :");
		System.out.println(game.data);

	}

}
