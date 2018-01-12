package com.readcollin0.apcs.war.cards;

public enum CardSuit {
	HEARTS("Hearts"),
	SPADES("Hearts"),
	CLUBS("Clubs"),
	DIAMONDS("Diamonds");
	
	public String name;
	CardSuit(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
