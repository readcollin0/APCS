package com.readcollin0.apcs.aptest;

import com.readcollin0.apcs.RunnerApp;

public class APQuestionRunner implements RunnerApp {

	@Override
	public void run() {
		for (int r = 3; r > 0; r--) {
			int c;
			
			for (c = 1; c < r; c++) {
				System.out.print("-");
			}
			
			for (c = r; c <= 3; c++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	@Override
	public String getName() {
		return "AP Question Runner";
	}

}
