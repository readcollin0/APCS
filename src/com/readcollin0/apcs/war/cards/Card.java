package com.readcollin0.apcs.war.cards;

public class Card {
	
	public final CardSuit suit;
	public final CardRank rank;
	
	public Card(CardSuit suit, CardRank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public CardRank getRank() {
		return rank;
	}
	
	public CardSuit getSuit() {
		return suit;
	}
	
	public String getShortName() {
		if (isJoker()) {
			return "Joker";
		} else {
			return rank.name.substring(0, 1) + " of " + suit.name.substring(0, 1);
		}
	}
	
	@Override
	public String toString() {
		if (isJoker()) {
			return "Joker";
		} else {
			return rank.name + " of " + suit.name;
		}
	}
	
	public boolean isJoker() {
		return rank.equals(CardRank.JOKER);
	}
}
