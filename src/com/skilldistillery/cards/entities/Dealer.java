package com.skilldistillery.cards.entities;

import com.skilldistillery.cards.blackjackapp.BlackJackHand;

public class Dealer extends Player{
	
	private Deck deck;
	
	public Dealer() {
		deck = new Deck();
		deck.shuffleDeck();
	}

	public Card dealCard() {
		Card card = deck.dealCard();
		
		return card;
	}


	
}
