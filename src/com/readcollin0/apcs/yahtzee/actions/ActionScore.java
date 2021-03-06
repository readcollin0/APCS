package com.readcollin0.apcs.yahtzee.actions;

import com.readcollin0.apcs.yahtzee.Yahtzee;
import com.readcollin0.apcs.yahtzee.categories.Category;

public class ActionScore implements Action {

	private Category category;
	
	public ActionScore(Category cat) {
		this.category = cat;
	}
	
	@Override
	public void runAction() {
		Yahtzee.game.score(category);
	}

}
