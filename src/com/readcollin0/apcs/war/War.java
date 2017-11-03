package com.readcollin0.apcs.war;

import com.readcollin0.apcs.RunnerApp;
import com.readcollin0.apcs.war.cards.Card;
import com.readcollin0.apcs.war.cards.CardDeck;

public class War implements RunnerApp {

	Player player1;
	Player player2;
	
	@Override
	public void run() {
		initGame();
		
		while (getGameStatus() == 0) {
			playRound();
			printNumCardsRemaining();
			System.out.print("\n\n\n");
		}
		
		System.out.printf("%s has won the game!\n\n\n\n", (getGameStatus() == 1) ? "Player 1" : "Player 2");
	}

	@Override
	public String getName() {
		return "War";
	}
	
	private void initGame() {
		CardDeck deck = new CardDeck(1, false);
		Card card = deck.draw();
		
		player1 = new Player(null);
		player2 = new Player(null);
		
		boolean player1Next = true;
		while (card != null) {
			if (player1Next) {
				player1.addCard(card);
			} else {
				player2.addCard(card);
			}
			player1Next = !player1Next;
			card = deck.draw();
		}
	}
	
	private void playRound() {
		CardsInPlay currentPlay = new CardsInPlay(player1, player2);
		currentPlay.playNextCard(false);
		
		while (currentPlay.areTheSame()) {
			System.out.println("Tie!");
			currentPlay.playNextCard(true);
		}
		
		boolean player1Won = currentPlay.player1Won();
		
		System.out.print(player1Won ? "Player 1" : "Player 2");
		System.out.printf(" won the set, containing %d cards!\n", currentPlay.getTotalCardsOut());
		
		if (player1Won) {
			currentPlay.addPlayer1Cards(currentPlay.getAllCardsOut());
		} else {
			currentPlay.addPlayer2Cards(currentPlay.getAllCardsOut());
		}
		
		currentPlay.resetOut();
	}
	
	/**
	 * @
	 * Gets the winning status of the game.
	 * @return 1 if won by player 1, 2 if won by player 2, 0 if still going.
	 */
	private int getGameStatus() {
		if (player2.remainingCards() == 0) return 1;
		if (player1.remainingCards() == 0) return 2;
		return 0;
	}
	
	private void printNumCardsRemaining() {
		System.out.printf("Player 1 has %d cards remaining!\n", player1.remainingCards());
		System.out.printf("Player 2 has %d cards remaining!\n", player2.remainingCards());
	}

}
