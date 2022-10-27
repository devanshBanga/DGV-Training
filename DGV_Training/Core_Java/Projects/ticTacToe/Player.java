package ticTacToe;

public class Player {
	private String name;
	private int streak;
	public Player(String name, int streak) {
		this.name = name;
		this.streak = streak;
	}
	public String getName() {
		return name;
	}
	public int getStreak() {
		return streak;
	}
	
}