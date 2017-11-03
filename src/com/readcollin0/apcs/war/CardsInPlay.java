package com.readcollin0.apcs.war;

import java.util.ArrayList;

import com.readcollin0.apcs.war.cards.Card;
import com.readcollin0.apcs.war.cards.CardRank;

public class CardsInPlay {

	private static CardRank[] cardRankList = new CardRank[] { CardRank.ACE, CardRank.KING, CardRank.QUEEN,
			CardRank.JACK, CardRank.TEN, CardRank.NINE, CardRank.EIGHT, CardRank.SEVEN, CardRank.SIX, CardRank.FIVE,
			CardRank.FOUR, CardRank.THREE, CardRank.TWO };

	private Player player1;
	private Player player2;

	public CardsInPlay(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void playNextCard(boolean playThree) {
		System.out.printf("Player 1 played the %s\n", player1.playNextCard(playThree));
		System.out.printf("Player 2 played the %s\n", player2.playNextCard(playThree));
	}

	public boolean areTheSame() {
		return (player1.getCurrentCard().getRank() == player2.getCurrentCard().getRank());
	}
	
	public int getTotalCardsOut() {
		return player1.getNumCardsOut() + player2.getNumCardsOut();
	}

	public ArrayList<Card> getAllCardsOut() {
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.addAll(player1.getCardsOut());
		cards.addAll(player2.getCardsOut());
		
		return cards;
	}

	/**
	 * IMPORTANT: CHECK FOR SAME FIRST
	 * 
	 * @return Whether or not player 1 won.
	 */
	public boolean player1Won() {
		for (CardRank rank : cardRankList) {
			if (player1.getCurrentCard().getRank().equals(rank)) {
				return true;
			} else if (player2.getCurrentCard().getRank().equals(rank)) {
				return false;
			}
		}
		return false;
	}

	public void resetOut() {
		player1.resetOut();
		player2.resetOut();
	}
	
	public void addPlayer1Cards(ArrayList<Card> cards) {
		player1.addCards(cards);
	}
	public void addPlayer2Cards(ArrayList<Card> cards) {
		player2.addCards(cards);
	}

}
