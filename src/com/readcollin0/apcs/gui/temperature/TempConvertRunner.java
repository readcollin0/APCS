package com.readcollin0.apcs.gui.temperature;

import com.readcollin0.apcs.RunnerApp;

public class TempConvertRunner implements RunnerApp {

	@Override
	public void run() {
		TempConvert.main(null);
	}

	@Override
	public String getName() {
		return "GUI - Temperature Converter";
	}

}
