package com.readcollin0.apcs.gui.tictactoe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SquareMouseClick extends MouseAdapter {

	private final int x, y;
	public SquareMouseClick(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void mousePressed(MouseEvent arg0) {
		TicTacToe.controller.makeMove(x, y);
	}
	
}
