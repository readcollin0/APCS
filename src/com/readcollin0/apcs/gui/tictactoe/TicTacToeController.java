package com.readcollin0.apcs.gui.tictactoe;

import java.util.ArrayList;

public class TicTacToeController {

	public static final ArrayList<Integer[]> WINNING_SETS = new ArrayList<Integer[]>();
	static {
		WINNING_SETS.add(new Integer[] { 1, 2, 3 });
		WINNING_SETS.add(new Integer[] { 4, 5, 6 });
		WINNING_SETS.add(new Integer[] { 7, 8, 9 });
		WINNING_SETS.add(new Integer[] { 1, 4, 7 });
		WINNING_SETS.add(new Integer[] { 2, 5, 8 });
		WINNING_SETS.add(new Integer[] { 3, 6, 9 });
		WINNING_SETS.add(new Integer[] { 1, 5, 9 });
		WINNING_SETS.add(new Integer[] { 3, 5, 7 });
	}

	char[] board = new char[9];
	char currentMove = 'X';

	public void initialize() {
		for (int i = 0; i < 9; i++) {
			board[i] = ' ';
		}
		updateBoard();
		currentMove = 'X';
	}

	public void makeMove(int x, int y) {
		if (board[3 * x + y] == ' ') {
			board[3 * x + y] = currentMove;
			updateBoard();
			updateClickableBoard();
			if (isGameWon()) {
				return;
			}
			currentMove = currentMove == 'X' ? 'O' : 'X';
			setHeader("");
		} else {
			TicTacToe.lblHeader.setText("Square already taken!");
		}
	}

	public void updateBoard() {
		for (int i = 0; i < 9; i++) {
			TicTacToe.buttons.get(i).setText(String.valueOf(board[i]));
		}
		updateClickableBoard();
	}

	public void updateClickableBoard() {
		for (int i = 0; i < 9; i++) {
			if (board[i] == ' ') {
				TicTacToe.buttons.get(i).setEnabled(true);
			} else {
				TicTacToe.buttons.get(i).setEnabled(false);
			}
		}
	}

	public void finalizeBoard() {
		for (int i = 0; i < 9; i++) {
			TicTacToe.buttons.get(i).setEnabled(false);
		}
	}

	public void winGame() {
		setHeader(String.valueOf(currentMove) + " has won!");
		finalizeBoard();
	}

	public void setHeader(String text) {
		TicTacToe.lblHeader.setText(text);
	}

	public boolean isGameWon() {
		for (Integer[] set : WINNING_SETS) {
			char first = board[set[0] - 1];
			if (first != ' ') {
				if (board[set[1] - 1] == first) {
					if (board[set[2] - 1] == first) {
						winGame();
						return true;
					}
				}
			}
		}

		boolean draw = true;
		for (int i = 0; i < 9; i++) {
			if (board[i] == ' ') {
				draw = false;
			}
		}

		if (draw) {
			setHeader("DRAW!");
			return true;
		}

		return false;
	}

}
