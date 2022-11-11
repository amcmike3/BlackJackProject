package com.skilldistillery.cards.blackjackapp;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.entities.Card;
import com.skilldistillery.cards.entities.Hand;

public class BlackJackHand extends Hand{

	@Override
	public int getHandValue() {
		List<Card> cards = super.getCards();
		int handTotal = 0;
		for (Card card : cards) {
			handTotal += card.getValue();
		}
		return handTotal;
	}
	public boolean isBlackJack() {
		
		return true;
	}
	public boolean isBust() {
		return true;
	}
	public boolean isHard(){
		//optional method
		return true;
	}
	public boolean isSoft(){
		//optional method
		return true;
	}

}
