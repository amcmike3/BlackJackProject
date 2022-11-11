package com.skilldistillery.cards.entities;

import com.skilldistillery.cards.blackjackapp.BlackJackHand;

public class Player {

	private BlackJackHand hand = new BlackJackHand();
	
	public void addCard(Card dealtCard) {
		hand.addCard(dealtCard);
		
	}

	public void showHand() {
		hand.showHand();
	}
	public int getHandVal() {
		return hand.getHandValue();
	}
}
