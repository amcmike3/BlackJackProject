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
	public void showHand(int i) {
		hand.showHand(i);
		
	}
	public int getHandVal() {
		return hand.getHandValue();
	}

	public Hand getHand() {
		return this.hand;
	}
	
	public boolean isBlackJack() {
		
		return hand.isBlackJack();
	}
	public boolean isBust() {
		return hand.isBust();
	}

	public boolean is21() {
		return hand.is21();
	}

	public boolean hasAce() {
		return hand.hasAce();
	}
}
