package com.readcollin0.apcs.gui.tictactoe;

import com.readcollin0.apcs.RunnerApp;

public class TicTacToeRunner implements RunnerApp {

	@Override
	public void run() {
		TicTacToe.main(new String[]{});
	}

	@Override
	public String getName() {
		return "Tic-Tac-Toe";
	}

}
