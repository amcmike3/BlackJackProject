package com.skilldistillery.cards.blackjackapp;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.entities.Card;
import com.skilldistillery.cards.entities.Hand;
import com.skilldistillery.cards.entities.Rank;

public class BlackJackHand extends Hand{
	private List<Card> cards = super.getCards();
	
	@Override
	public int getHandValue() {
		int handTotal = 0;
		for (Card card : cards) {
			handTotal += card.getValue();
		}
		if (handTotal > 21 && hasAce()) {
			handTotal -= 10;
		}
		return handTotal;
	}
	public boolean isBlackJack() {
		boolean ans = false;
		if (cards.size() == 2 && getHandValue() == 21 ) {
			ans = true;
		}
		return ans;
	}
	public boolean is21() {
		boolean ans = false;
		if (getHandValue() == 21) {
			ans = true;
		}
		return ans;
	}
	public boolean isBust() {
		boolean bust = false;
		if( getHandValue() > 21) {
			bust = true;
		}
		return bust;
	}
	public boolean hasAce(){
		boolean ans = false;
		for (Card card : cards) {
			if (card.getRank() == Rank.ACE) {
				ans = true;
			}
		}
		return ans;
	}
	public boolean isHard(){
		//optional method
		return true;
	}


}
