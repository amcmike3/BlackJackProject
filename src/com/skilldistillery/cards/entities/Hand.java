package com.skilldistillery.cards.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	private List<Card> cards;
	
	public abstract int getHandValue();
	public Hand() {
		cards = new ArrayList<Card>();
	}
	public List<Card> getCards(){
		return cards;
	}
	public void showHand() {
		if(cards.size() > 0) {
			for (Card card : cards) {
				System.out.println(card);
			}
		}
	}
	public void showHand(int numCardsToShow) {
		if(cards.size() > 0) {
			for (int i = 0; i < numCardsToShow; i++) {
				System.out.println(cards.get(i));
			}
		}
	}
	
	public void addCard(Card card) {
		this.getClass().getSimpleName();
		cards.add(card);
	}
	
	public void clear() {
		cards = new ArrayList<Card>();
	}
	public String toString() {
		return "";
	}
	public Hand getHand(){
		return this;
	}

}
