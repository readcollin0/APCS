package com.readcollin0.apcs.war;

import java.util.ArrayList;

import com.readcollin0.apcs.war.cards.Card;
import com.readcollin0.apcs.war.cards.CardGroup;

public class Player {

	private CardGroup cards, cardsWon;
	private ArrayList<Card> cardsOut = new ArrayList<Card>();
	private Card currentCard;

	public Player(CardGroup cards) {
		if (cards == null) {
			this.cards = new CardGroup(null);
		} else this.cards = cards;
		
		cardsWon = new CardGroup(null);
	}

	public Card playNextCard(boolean playThree) {
		if (playThree) {
			if (remainingCards() > 2) {
				cardsOut.add(drawCard());
				cardsOut.add(drawCard());
			} else if (remainingCards() == 2) {
				cardsOut.add(drawCard());
			}
		}
		
		if (remainingCards() > 0) {
			currentCard = drawCard();
			cardsOut.add(currentCard);
		} else {
			System.out.println("There are no cards remaining");
		}
		
		return currentCard;
	}
	
	public void resetOut() {
		cardsOut.clear();
	}
	
	public Card drawCard() {
		if (cards.getCardsRemaining() == 0) {
			cardsWon.shuffle();
			cards = cardsWon;
			cardsWon = new CardGroup(null);
		}
		return cards.draw();
	}
	
	public int getNumCardsOut() {
		return cardsOut.size();
	}
	
	public void addCard(Card card) {
		cards.addCard(card);
	}

	public Card getCurrentCard() {
		return currentCard;
	}

	public ArrayList<Card> getCardsOut() {
		return cardsOut;
	}

	public CardGroup getCards() {
		return cards;
	}

	public void finishRound() {
		cardsOut.clear();
	}
	
	public int remainingCards() {
		return cards.getCardsRemaining() + cardsWon.getCardsRemaining();
	}

	public void addCards(ArrayList<Card> cardsToAdd) {
		cardsWon.addCards(cardsToAdd);
	}

}
