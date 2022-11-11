package com.skilldistillery.cards.blackjackapp;

import java.util.Scanner;

import com.skilldistillery.cards.entities.Dealer;
import com.skilldistillery.cards.entities.Deck;
import com.skilldistillery.cards.entities.Player;

public class BlackJackApp {

	Scanner scanner;

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.run();
	}

	private void run() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to Black Jack Good Luck!!");
		String choice = "";
		while (!(choice.equalsIgnoreCase("quit"))) {
			Dealer dealer = new Dealer();
			Player player = new Player();
			for (int i = 0; i < 2; i++) {
				player.addCard(dealer.dealCard());
				dealer.addCard(dealer.dealCard());
			}
			showCardsInPlay(dealer, player);
			
			System.out.println("Would you like to Hit or Stay");
			String toHitOrNotToHit = scanner.next();
			scanner.nextLine();
			int playerScore = hitOrNah(dealer, player, toHitOrNotToHit);
			int dealerScore = hitOrNahDealerEdition(dealer);
			
			
			System.out.println("Type quit to stop or anything else to continue");
			choice = scanner.nextLine();
		}

	}

	private int hitOrNahDealerEdition(Dealer dealer) {
		
		while(dealer.getHandVal() <= 16) {
			hitOrNah(dealer, dealer, "Hit");
		}
		
		return dealer.getHandVal();
	}

	private int hitOrNah(Dealer dealer, Player player, String hit) {
		while ((!(hit.equalsIgnoreCase("Stay"))) && (player.getHandVal() <= 21)) {
			player.addCard(dealer.dealCard());
			player.showHand();
			if(player.getHandVal() > 21) {
				System.out.println("Bust you lose!");
				break;
			} else if (player.getHandVal() == 21) {
				System.out.println("Congrats!! 21!");
				break;
			} else {
				System.out.println("Would you like to Hit or Stay");
				hit = scanner.next();
				scanner.nextLine();
			}
			
		}
		return player.getHandVal();
	}

	private void showCardsInPlay(Dealer dealer, Player player) {
		System.out.println("Dealers Cards:");
		dealer.showOneCard();
		System.out.println("Players Cards:");
		player.showHand();
	}


}
