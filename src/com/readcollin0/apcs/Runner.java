package com.readcollin0.apcs;

import java.util.HashMap;
import java.util.Scanner;

import org.collegeboard.magpie.MagpieRunner2;
import org.collegeboard.magpie.MagpieRunner3;
import org.collegeboard.magpie.MagpieRunner4;
import org.collegeboard.magpie.MagpieRunner5;
import org.collegeboard.magpie.StringExplorer;

import com.readcollin0.apcs.yahtzee.Yahtzee;
import com.readcollin0.apcs.zoo.JavaZoo;

public class Runner {

	@SuppressWarnings("unchecked")
	public static final Class<RunnerApp>[] list = new Class[] {
		Yahtzee.class,
		JavaZoo.class,
		MagpieRunner2.class,
		MagpieRunner3.class,
		MagpieRunner4.class,
		MagpieRunner5.class,
		StringExplorer.class
	};
	
	private static HashMap<String, RunnerApp> options = new HashMap<String, RunnerApp>();
	public static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		printIntro();
		
		while (true) {
			printOptions();
			runChoice();
		}
		
	}
	
	public static void printIntro() {
		
	}
	
	public static void printOptions() {
		for (int index = 0; index < list.length; index++) {
			try {
				options.put(String.valueOf(index+1), list[index].newInstance());
				System.out.printf("%d: %s%n", index+1, options.get(String.valueOf(index+1)).getName());
			} catch (InstantiationException e) {
				continue;
			} catch (IllegalAccessException e) {
				continue;
			}
		}
		System.out.println();
	}
	
	public static void runChoice() {
		String num = in.nextLine();
		if (options.containsKey(num)) {
			options.get(num).run();
		} else {
			System.out.println("Invalid Response");
		}
		System.out.println("-------------------------------------------------------------------------");
	}

}
