package com.skilldistillery.cards.blackjackapp;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.entities.Card;
import com.skilldistillery.cards.entities.Dealer;
import com.skilldistillery.cards.entities.Player;
import com.skilldistillery.cards.entities.Rank;

public class BlackJackApp {

	Scanner scanner;
	Dealer dealer;
	Player player;

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.run();
	}

	private void run() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to Black Jack Good Luck!!");
		String choice = "";
		while (!(choice.equalsIgnoreCase("quit"))) {
			dealer = new Dealer();
			player = new Player();
			for (int i = 0; i < 2; i++) {
				player.addCard(dealer.dealCard());
				dealer.addCard(dealer.dealCard());
			}
			showInitialCards();
			System.out.println(player.getHandVal());

			int playerScore = hitOrNah();
			int dealerScore;
			if (!player.isBust()) {
				dealerScore = hitOrNahDealerEdition();
				System.out.println("Dealer score = " + dealerScore);
			} else {
				dealerScore = dealer.getHandVal();
				System.out.println("Dealer score = " + dealerScore);
			}
			System.out.println("Player score = " + playerScore);
			pickWinner(playerScore, dealerScore);

			System.out.println("Type quit to stop or anything else to continue");
			choice = scanner.nextLine();
		}

	}

	private void pickWinner(int playerScore, int dealerScore) {
		if (dealer.isBust()) {
			System.out.println("Dealer Busts, You WIN!!");
		} else if (playerScore > dealerScore && !player.isBust()) {
			System.out.println("You scored higher than the Dealer, You WIN!!");
		} else if (playerScore == dealerScore) {
			System.out.println("Its a push...");
		} else {
			System.out.println("Better luck next time, Dealer wins");
		}

	}

	private int hitOrNahDealerEdition() {
		System.out.println("Dealer: ");
		dealer.showHand();
		while (dealer.getHandVal() <= 16) {
			System.out.println("Dealer: ");
			dealer.addCard(dealer.dealCard());
			dealer.showHand();
			System.out.println(dealer.getHandVal());
			if (dealer.isBust()) {
				System.out.println("Dealer Busts");
				break;
			} else if (!dealer.hitAgain()) {
				break;
			}
		}

		return dealer.getHandVal();
	}

	private int hitOrNah() {
		String hit = "Stay";
		if(!(player.isBlackJack())) {
			System.out.println("Would you like to Hit or Stay");
			hit = scanner.next();
			scanner.nextLine();
		} else {
			System.out.println("Woah BlackJack!!");
		}
		int ans = 0;
		while ((!(hit.equalsIgnoreCase("Stay"))) && (!player.isBust()) && (!(player.isBlackJack()))) {
			player.addCard(dealer.dealCard());
			player.showHand();
			ans = player.getHandVal();
			
			System.out.println(ans);
			if (player.isBust()) {
				System.out.println("Bust You Lose!");
				break;
			} else if (player.is21()) {
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


	private void showInitialCards() {
		System.out.println("Dealers Cards:");
		dealer.showHand(1);
		System.out.println("** of *");
		System.out.println("Players Cards:");
		player.showHand();
	}

}
