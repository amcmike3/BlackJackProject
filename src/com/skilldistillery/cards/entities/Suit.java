package com.skilldistillery.cards.entities;

public enum Suit {
	HEARTS("♥"), SPADES("♠"), CLUBS("♣"), DIAMONDS("♦");
	private String name;
	private Suit(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	public String getName() {
		return name;
	}

	
}
