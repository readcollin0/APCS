package com.readcollin0.apcs.zoo;

import com.readcollin0.apcs.RunnerApp;

/**
 * Write a description of class JavaZoo here.
 * 
 * @author Mr. Jaffe
 * @version 2017-07-014
 */
public class JavaZoo implements RunnerApp
{
	
	public void run() {
		main(new String[] {});
	}
  
	public static void main(String[] args) {

		// Change BoopleSnoot to the name of your animal class and run the
		// 'main'
		// method to test your class. You can also test your class using BlueJ
		String[] animalList = { "com.readcollin0.apcs.zoo.RogerJaffe",
				"com.readcollin0.apcs.zoo.AnimatedHumanoidPotato" };

		try {
			for (int i = 0; i < animalList.length; i++) {
				Object a = Class.forName(animalList[i]).newInstance();
				System.out.println("Animal #" + (i + 1) + " by " + ((Animal) a).getStudentName());
				System.out.println(a.toString());
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Someone messed up!");

			e.printStackTrace();
		}
	}

	@Override
	public String getName() {
		return "Java Zoo";
	}
}
