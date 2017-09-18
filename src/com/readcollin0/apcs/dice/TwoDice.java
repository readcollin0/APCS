package com.readcollin0.apcs.dice;

public class TwoDice {
	
	Die[] dice = new Die[2];
	
	public TwoDice() {
		this.dice[0] = new Die(1,6);
		this.dice[1] = new Die(1,6);
		dice[0].roll();
		dice[1].roll();
	}
	
	public void roll() {
		for (Die die : dice) {
			die.roll();
		}
	}
	
	public int[] getDice() {
		int[] diceNums = new int[2];
		diceNums[0] = dice[0].getLastRoll();
		diceNums[1] = dice[1].getLastRoll();
		return diceNums;
	}
	
	public int getTotal() {
		return dice[0].getLastRoll() + dice[1].getLastRoll();
	}
	
	public boolean isDoubles() {
		return (dice[0].getLastRoll() == dice[1].getLastRoll());
	}
	
}
