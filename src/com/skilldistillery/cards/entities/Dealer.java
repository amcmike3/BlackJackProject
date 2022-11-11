package com.skilldistillery.cards.entities;

import com.skilldistillery.cards.blackjackapp.BlackJackHand;

public class Dealer extends Player{
	
	private BlackJackHand hand = new BlackJackHand();
	private Deck deck;
	
	public Dealer() {
		deck = new Deck();
		deck.shuffleDeck();
	}

	public Card dealCard() {
		Card card = deck.dealCard();
		
		return card;
	}
	@Override
	public void addCard(Card dealtCard) {
		hand.addCard(dealtCard);
		
	}

	public void showOneCard() {
		hand.showHand(1);
		System.out.println("** of *");
		
	}


	
}
