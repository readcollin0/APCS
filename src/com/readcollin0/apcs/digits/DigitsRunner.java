package com.readcollin0.apcs.digits;

import com.readcollin0.apcs.Runner;
import com.readcollin0.apcs.RunnerApp;

public class DigitsRunner implements RunnerApp {

	@Override
	public void run() {
		String in = Runner.in.nextLine();
		int num = Integer.parseInt(in);
		Digits dig = new Digits(num);
		System.out.println(dig.getDigitList());
		System.out.println(dig.isStrictlyIncreasing());
	}

	@Override
	public String getName() {
		return "Digits Class Test";
	}

}
