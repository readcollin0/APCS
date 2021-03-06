package org.collegeboard.magpie;

import java.util.Scanner;

import com.readcollin0.apcs.RunnerApp;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner4 implements RunnerApp
{
	
	public void run() {
		main(new String[] {});
	}

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie4 maggie = new Magpie4();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
		in.close();
	}

	@Override
	public String getName() {
		return "Magpie Version 4";
	}

}
