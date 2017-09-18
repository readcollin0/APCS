package com.readcollin0.apcs.yahtzee.categories;

import com.readcollin0.apcs.dice.Die;
import com.readcollin0.apcs.yahtzee.util.DiceCounts;

public class ScoreFullHouse extends PointCategory {
	
	@Override
	public boolean checkSet(Die[] dice) {
		DiceCounts counts = new DiceCounts(dice);
		boolean worksTwo = false;
		boolean worksThree = false;
		
		for (int count : counts.getCounts()) {
			if (count == 2) worksTwo = true;
			if (count == 3) worksThree = true;
		}
		
		return worksTwo && worksThree;
	}

	@Override
	public int setScore(Die[] dice) {
		this.score = 25;
		return 25;
	}

}
