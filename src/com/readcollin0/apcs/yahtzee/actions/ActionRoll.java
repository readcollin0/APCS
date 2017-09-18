package com.readcollin0.apcs.yahtzee.actions;

import com.readcollin0.apcs.yahtzee.Yahtzee;

public class ActionRoll implements Action {
	
	public ActionRoll() {
	}
	
	@Override
	public void runAction() {
		System.out.println("Good Luck!");
		Yahtzee.game.rollNext();
	}

}
