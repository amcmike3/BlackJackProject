package com.skilldistillery.cards.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> deck;
	
	 public Deck() {
		 deck = generateDeck();
	 }
	 
	 public void shuffleDeck() {
		 Collections.shuffle(this.deck);
	 }
	 
	 public Card dealCard() {
		 return deck.remove(0);
	 }
	 
	 public int checkDeckSize() {
		 return deck.size();
	 }
	 
	 private ArrayList<Card> generateDeck(){
		 ArrayList<Card> deck = new ArrayList<>();
		 for (Rank rank : Rank.values()) {
			 for (Suit suit : Suit.values()) {
				 Card tempCard = new Card(suit, rank);
				 deck.add(tempCard);
			 }
		 }
		 return deck;
		 
	 }
	 
}
