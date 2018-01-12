package com.readcollin0.apcs.war.cards;

import java.util.ArrayList;
import java.util.Random;

public class CardDeck {

	private static final Random random = new Random();
	protected ArrayList<Card> cards = new ArrayList<Card>();

	public CardDeck(int decks, boolean includeJoker) {
		for (int deck = 0; deck < decks; deck++) {
			for (CardSuit suit : CardSuit.values()) {
				for (CardRank rank : CardRank.values()) {
					if (rank.equals(CardRank.JOKER)) continue;
					cards.add(new Card(suit, rank));
				}
			}
			if (includeJoker) {
				cards.add(new Card(null, CardRank.JOKER));
				cards.add(new Card(null, CardRank.JOKER));
			}
		}
		
		for (int i=0; i<cards.size(); i++) {
			for (int j=0; j<cards.size(); j++) {
				if (j!=i) {
					if (cards.get(j) == cards.get(i)) {
						System.out.println("DUPLICATES");
						System.exit(1);
					}
				}
			}
		}

		this.shuffle();
	}

	public void shuffle() {
		ArrayList<Card> newCards = new ArrayList<Card>();
		while (cards.size() > 0) {
			int cardIndex = random.nextInt(cards.size());
			newCards.add(cards.get(cardIndex));
			cards.remove(cardIndex);
		}

		cards = newCards;
	}

	public Card draw() {
		if (cards.size() != 0) {
			Card card = cards.get(0);
			cards.remove(0);
			return card;
		} else {
			return null;
		}
	}

	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void addCards(ArrayList<Card> cards) {
		this.cards.addAll(cards);
	}
	
	public int getCardsRemaining() {
		return cards.size();
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}

}
