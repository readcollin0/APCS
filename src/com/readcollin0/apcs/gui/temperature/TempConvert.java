package com.readcollin0.apcs.gui.temperature;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TempConvert {

	private JFrame frame;
	private JTextField textFahr;
	private JTextField textCelcius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TempConvert window = new TempConvert();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TempConvert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 386, 147);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFahrenheit = new JLabel("Fahrenheit");
		lblFahrenheit.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFahrenheit.setBounds(10, 48, 52, 14);
		frame.getContentPane().add(lblFahrenheit);
		
		textFahr = new JTextField();
		textFahr.setBounds(72, 45, 120, 20);
		frame.getContentPane().add(textFahr);
		textFahr.setColumns(10);
		
		textCelcius = new JTextField();
		textCelcius.setBounds(198, 45, 120, 20);
		frame.getContentPane().add(textCelcius);
		textCelcius.setColumns(10);
		
		JLabel lblCelcius = new JLabel("Celcius");
		lblCelcius.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCelcius.setBounds(328, 48, 46, 14);
		frame.getContentPane().add(lblCelcius);
		
		JButton btnConvertFtoC = new JButton("Fahrenheit to Celcius -->");
		btnConvertFtoC.setFont(new Font("Arial", Font.PLAIN, 11));
		btnConvertFtoC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String input = textFahr.getText();
				try {
					float fahr = Float.parseFloat(input);
					float celcius = (float) ((fahr-32)/1.8);
					textCelcius.setText(String.valueOf(celcius));
				} catch (Exception ex) {
					textCelcius.setText(ex.getMessage());
				}
				
			}
		});
		btnConvertFtoC.setBounds(99, 76, 191, 23);
		frame.getContentPane().add(btnConvertFtoC);
		
		JButton btnConvertCtoF = new JButton("<-- Celcius to Fahrenheit");
		btnConvertCtoF.setFont(new Font("Arial", Font.PLAIN, 11));
		btnConvertCtoF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String input = textCelcius.getText();
				try {
					float celcius = Float.parseFloat(input);
					float fahr = (float) ((celcius*1.8)+32);
					textFahr.setText(String.valueOf(fahr));
				} catch (Exception ex) {
					textFahr.setText(ex.getMessage());
				}
				
			}
		});
		btnConvertCtoF.setBounds(99, 11, 191, 23);
		frame.getContentPane().add(btnConvertCtoF);
	}

}
