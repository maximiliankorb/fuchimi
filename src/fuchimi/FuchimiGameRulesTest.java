package fuchimi;

import java.util.Scanner;
import java.util.Random;

import fuchimi.Hand;
import fuchimi.Paper;
import fuchimi.Rock;
import fuchimi.Scissors;

public class FuchimiGameRulesTest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();

		while (i != 0) {
			System.out.println("Choose your Hand:" + "\n" + "Enter 1 for Rock"
					+ "\n" + "Enter 2 for Paper" + "\n" + "Enter 3 for Scissor"
					+ "\n" + "Enter 0 to Quit" + "\n");

			Hand playerHand = hand(i);
			System.out.println("You chose: " + playerHand.toString());
			Hand aiHand = aiHand();
			System.out.println("AI chose: " + aiHand.toString());
			System.out.println(playerHand.beats(aiHand));
			i = in.nextInt();
		}
	}

	public static Hand hand(int i) {

		Hand hand1;

		switch (i) {
		case 1:
			hand1 = new Rock();
			break;
		case 2:
			hand1 = new Paper();
			break;
		case 3:
			hand1 = new Scissors();
			break;
		default:
			return null;

		}

		return hand1;

	}

	public static Hand aiHand() {
		Random generator = new Random();
		int random = generator.nextInt(3);
		random = random + 1;
		return hand(random);
	}
	
}
