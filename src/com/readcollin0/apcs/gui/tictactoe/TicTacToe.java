package com.readcollin0.apcs.gui.tictactoe;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TicTacToe {

	private JFrame frmTictactoe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frmTictactoe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}

	static TicTacToeController controller = new TicTacToeController();
	static ArrayList<JButton> buttons = new ArrayList<JButton>();
	static JLabel lblHeader;
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTictactoe = new JFrame();

		frmTictactoe.setTitle("Tic-Tac-Toe");
		frmTictactoe.setResizable(false);
		frmTictactoe.setBounds(100, 100, 195, 280);
		frmTictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTictactoe.getContentPane().setLayout(null);
		
		for (int x=0; x<3; x++) {
			for (int y=0; y<3; y++) {
				JButton newBtn = new JButton("");
				newBtn.addMouseListener(new SquareMouseClick(x, y));
				int size = 50;
				newBtn.setBounds(10 + ((size+10)*x), 40 + ((size+10)*y), size, size);
				buttons.add(newBtn);
				frmTictactoe.getContentPane().add(buttons.get(3*x+y));
			}
		}
		
		JButton btnRestart = new JButton("Restart Game");
		btnRestart.setBounds(40, 220, 115, 20);
		btnRestart.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				controller.initialize();
			}
		});
		frmTictactoe.getContentPane().add(btnRestart);
		
		controller.initialize();
		
		lblHeader = new JLabel("");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setBounds(10, 15, 170, 14);
		frmTictactoe.getContentPane().add(lblHeader);
	}
}
