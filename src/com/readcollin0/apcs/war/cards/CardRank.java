package com.readcollin0.apcs.war.cards;

public enum CardRank {

	ACE("Ace"),
	TWO("Two"),
	THREE("Three"),
	FOUR("Four"),
	FIVE("Five"),
	SIX("Six"),
	SEVEN("Seven"),
	EIGHT("Eight"),
	NINE("Nine"),
	TEN("Ten"),
	JACK("Jack"),
	QUEEN("Queen"),
	KING("King"),
	JOKER("Joker");
	
	
	public String name;
	CardRank(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
