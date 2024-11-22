package com.ibm.training.io.serialization;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
public class GameData implements Serializable {
	
	int points = 0, level = 1, lives = 10;
	String[] avatars = new String[] {"fighter","rookie"};
	
	
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public String[] getAvatars() {
		return avatars;
	}
	public void setAvatars(String[] avatars) {
		this.avatars = avatars;
	}
	
	@Override
	public String toString() {
		return "GameData [points=" + points + ", level=" + level + ", lives=" + lives + ", avatars="
				+ Arrays.toString(avatars) + "]";
	}

	
	
	
}
