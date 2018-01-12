package com.readcollin0.apcs.war.cards;

import java.util.ArrayList;

public class CardGroup extends CardDeck {

	public CardGroup(ArrayList<Card> cards) {
		super(0, false);
		if (cards != null) {
			this.cards = cards;
		}
	}

	public Card getCard(int index) {
		return cards.get(index);
	}

}
