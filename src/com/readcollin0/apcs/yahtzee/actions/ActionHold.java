package com.readcollin0.apcs.yahtzee.actions;

import com.readcollin0.apcs.yahtzee.Yahtzee;

public class ActionHold implements Action {

	private int die;
	public ActionHold(int die) {
		this.die = die;
	}
	
	@Override
	public void runAction() {
		Yahtzee.game.hold(die);
	}

}
