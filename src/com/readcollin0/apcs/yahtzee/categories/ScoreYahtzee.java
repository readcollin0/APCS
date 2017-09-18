package com.readcollin0.apcs.yahtzee.categories;

import com.readcollin0.apcs.dice.Die;
import com.readcollin0.apcs.yahtzee.util.DiceCounts;

public class ScoreYahtzee extends PointCategory {
	
	@Override
	public boolean checkSet(Die[] dice) {
		DiceCounts counts = new DiceCounts(dice);
		for (int count : counts.getCounts()) {
			if (count == 5) return true;
		}
		return false;
	}
	
	@Override
	public int setScore(Die[] dice) {
		int thisScore = 0;
		if (score <= 0) {
			score = 50;
			thisScore = 50;
		} else {
			score += 150;
			thisScore = 150;
		}
		return thisScore;
	}

	@Override
	public boolean isYahtzee() {
		return true;
	}
	
}
