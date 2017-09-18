package com.readcollin0.apcs.zoo;

public class AnimatedHumanoidPotato extends Animal {
	
	public AnimatedHumanoidPotato() {
		super("Collin Read", "Brown", 2);
	}
	
	public String getType() {
		return "Humanoid Potato";
	}
	
	@Override
	public String getDisposition() {
		return "Evil Mastermind";
	}
	
	@Override
	public String getName() {
		return "Tony Starch";
	}
	
	@Override
	public String getStudentName() {
		return "Collin Read";
	}
	
	@Override
	public String speak() {
		return "Foolish Mortals!";
	}
	
}
