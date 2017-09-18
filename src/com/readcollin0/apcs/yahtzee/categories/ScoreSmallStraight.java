package com.readcollin0.apcs.yahtzee.categories;

import java.util.ArrayList;

import com.readcollin0.apcs.dice.Die;
import com.readcollin0.apcs.yahtzee.util.Utils;

public class ScoreSmallStraight extends PointCategory {
	
	@Override
	public boolean checkSet(Die[] dice) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (Die die : dice) {
			nums.add(die.getLastRoll());
		}
		
		if (Utils.checkForContains(nums, new Integer[][] {{1,2,3,4}, {2,3,4,5}, {3,4,5,6}})) return true;
		return false;
	}

	@Override
	public int setScore(Die[] dice) {
		this.score = 30;
		return 30;
	}

}
