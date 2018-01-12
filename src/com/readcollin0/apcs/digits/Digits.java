package com.readcollin0.apcs.digits;

import java.util.ArrayList;

public class Digits {
	
	private ArrayList<Integer> digitList;
	
	public Digits(int num) {
		digitList = new ArrayList<Integer>();
		String numStr = String.valueOf(num);
		for (int i=0; i<numStr.length(); i++) {
			digitList.add(Integer.parseInt(numStr.substring(i,i+1)));
		}
	}
	
	public boolean isStrictlyIncreasing() {
		for (int i = 0; i < digitList.size() - 1; i++) {
			if (digitList.get(i) >= digitList.get(i+1)) return false;
		}
		
		return true;
	}
	
	public ArrayList<Integer> getDigitList() {
		return digitList;
	}
	
}
