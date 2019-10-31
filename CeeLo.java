package dicePkg;
import java.awt.Canvas;

import objectdraw.*;

public class CeeLo extends WindowController {

	// constants for text locations
	private final Location NEW_GAME_LOC = new Location(50, 100);
	private final Location RESULT_LOC = new Location(100, 200);
	private final Location POKER_LOC = new Location(100, 215);
	private final Location DIE_1_LOC = new Location(50, 100);
	private final Location DIE_2_LOC = new Location(150, 100);
	private final Location DIE_3_LOC = new Location(250, 100);
	private final Location PLAY_AGAIN = new Location(50, 150);
	private final Location REROLL_LOC = new Location(100, 240);
	private final Location WELCOME_LOC = new Location(50, 85);

	// roller assigns values to ints
	private int roll1, roll2, roll3;
	private RandomIntGenerator roller = new RandomIntGenerator(1, 6);

	// text objects
	private Text newGame, result, ceeLoHand, playAgain, reRoll, welcome;

	// these objects create the dice on screen
	private FramedRect die1, die2, die3;
	private FilledOval spot1, spot2, spot3, spot4, spot5, spot6, d2Spot1, d2Spot2, d2Spot3, d2Spot4, d2Spot5, d2Spot6,
			d3Spot1, d3Spot2, d3Spot3, d3Spot4, d3Spot5, d3Spot6;

	// begin() method displays click to play text
	public void begin() {

		welcome = new Text("Welcome to CeeLo!!", WELCOME_LOC, canvas);
		newGame = new Text("Click the mouse in window to play!", NEW_GAME_LOC, canvas);

	}
	
	/*public void onMouseExit(Location point) {

		canvas.clear();
		playAgain = new Text("Roll again? (Move cursor back into window.)", PLAY_AGAIN, canvas);

	}*/
	
	public void onMouseEnter(Location point) {
		canvas.clear();
		playAgain = new Text("Click mouse to roll.", WELCOME_LOC, canvas);
	}

	// onMouseEnter() method runs game.
	// Random ints are assigned to die objects
	// result Text is set and displayed
	public void onMouseClick(Location point) {

		canvas.clear();
		roll1 = roller.nextValue();
		roll2 = roller.nextValue();
		roll3 = roller.nextValue();

		die1 = new FramedRect(DIE_1_LOC, 50, 50, canvas);
		die2 = new FramedRect(DIE_2_LOC, 50, 50, canvas);
		die3 = new FramedRect(DIE_3_LOC, 50, 50, canvas);

		// series of if-else statements creates appropriate FilledOvals
		// based on random dice roll
		if (roll1 == 1) {
			spot1 = new FilledOval(70, 120, 10, 10, canvas);
		} else if (roll1 == 2) {
			spot1 = new FilledOval(55, 130, 10, 10, canvas);
			spot2 = new FilledOval(85, 110, 10, 10, canvas);
		} else if (roll1 == 3) {
			spot1 = new FilledOval(55, 130, 10, 10, canvas);
			spot2 = new FilledOval(70, 120, 10, 10, canvas);
			spot3 = new FilledOval(85, 110, 10, 10, canvas);
		} else if (roll1 == 4) {
			spot1 = new FilledOval(55, 110, 10, 10, canvas);
			spot2 = new FilledOval(55, 130, 10, 10, canvas);
			spot3 = new FilledOval(85, 110, 10, 10, canvas);
			spot4 = new FilledOval(85, 130, 10, 10, canvas);
		} else if (roll1 == 5) {
			spot1 = new FilledOval(55, 110, 10, 10, canvas);
			spot2 = new FilledOval(55, 130, 10, 10, canvas);
			spot3 = new FilledOval(85, 110, 10, 10, canvas);
			spot4 = new FilledOval(85, 130, 10, 10, canvas);
			spot5 = new FilledOval(70, 120, 10, 10, canvas);
		} else {
			spot1 = new FilledOval(60, 105, 10, 10, canvas);
			spot2 = new FilledOval(60, 120, 10, 10, canvas);
			spot3 = new FilledOval(60, 135, 10, 10, canvas);
			spot4 = new FilledOval(80, 105, 10, 10, canvas);
			spot5 = new FilledOval(80, 120, 10, 10, canvas);
			spot6 = new FilledOval(80, 135, 10, 10, canvas);
		}
		if (roll2 == 1) {
			d2Spot1 = new FilledOval(170, 120, 10, 10, canvas);
		} else if (roll2 == 2) {
			d2Spot1 = new FilledOval(155, 130, 10, 10, canvas);
			d2Spot2 = new FilledOval(185, 110, 10, 10, canvas);
		} else if (roll2 == 3) {
			d2Spot1 = new FilledOval(155, 130, 10, 10, canvas);
			d2Spot2 = new FilledOval(170, 120, 10, 10, canvas);
			d2Spot3 = new FilledOval(185, 110, 10, 10, canvas);
		} else if (roll2 == 4) {
			d2Spot1 = new FilledOval(155, 110, 10, 10, canvas);
			d2Spot2 = new FilledOval(155, 130, 10, 10, canvas);
			d2Spot3 = new FilledOval(185, 110, 10, 10, canvas);
			d2Spot4 = new FilledOval(185, 130, 10, 10, canvas);
		} else if (roll2 == 5) {
			d2Spot1 = new FilledOval(155, 110, 10, 10, canvas);
			d2Spot2 = new FilledOval(155, 130, 10, 10, canvas);
			d2Spot3 = new FilledOval(185, 110, 10, 10, canvas);
			d2Spot4 = new FilledOval(185, 130, 10, 10, canvas);
			d2Spot5 = new FilledOval(170, 120, 10, 10, canvas);
		} else {
			d2Spot1 = new FilledOval(160, 105, 10, 10, canvas);
			d2Spot2 = new FilledOval(160, 120, 10, 10, canvas);
			d2Spot3 = new FilledOval(160, 135, 10, 10, canvas);
			d2Spot4 = new FilledOval(180, 105, 10, 10, canvas);
			d2Spot5 = new FilledOval(180, 120, 10, 10, canvas);
			d2Spot6 = new FilledOval(180, 135, 10, 10, canvas);
		}

		if (roll3 == 1) {
			d3Spot1 = new FilledOval(270, 120, 10, 10, canvas);
		} else if (roll3 == 2) {
			d3Spot1 = new FilledOval(255, 130, 10, 10, canvas);
			d3Spot2 = new FilledOval(285, 110, 10, 10, canvas);
		} else if (roll3 == 3) {
			d3Spot1 = new FilledOval(255, 130, 10, 10, canvas);
			d3Spot2 = new FilledOval(270, 120, 10, 10, canvas);
			d3Spot3 = new FilledOval(285, 110, 10, 10, canvas);
		} else if (roll3 == 4) {
			d3Spot1 = new FilledOval(255, 110, 10, 10, canvas);
			d3Spot2 = new FilledOval(255, 130, 10, 10, canvas);
			d3Spot3 = new FilledOval(285, 110, 10, 10, canvas);
			d3Spot4 = new FilledOval(285, 130, 10, 10, canvas);
		} else if (roll3 == 5) {
			d3Spot1 = new FilledOval(255, 110, 10, 10, canvas);
			d3Spot2 = new FilledOval(255, 130, 10, 10, canvas);
			d3Spot3 = new FilledOval(285, 110, 10, 10, canvas);
			d3Spot4 = new FilledOval(285, 130, 10, 10, canvas);
			d3Spot5 = new FilledOval(270, 120, 10, 10, canvas);
		} else {
			d3Spot1 = new FilledOval(260, 105, 10, 10, canvas);
			d3Spot2 = new FilledOval(260, 120, 10, 10, canvas);
			d3Spot3 = new FilledOval(260, 135, 10, 10, canvas);
			d3Spot4 = new FilledOval(280, 105, 10, 10, canvas);
			d3Spot5 = new FilledOval(280, 120, 10, 10, canvas);
			d3Spot6 = new FilledOval(280, 135, 10, 10, canvas);
		}

		result = new Text("You rolled a " + roll1 + ", " + roll2 + ", " + roll3 + ".", RESULT_LOC, canvas);
		if (roll1 == roll2 && roll1 == roll3) {
			ceeLoHand = new Text("You rolled trip " + roll1 + "'s!", POKER_LOC, canvas);
		} else if (roll1 == roll2) {
			ceeLoHand = new Text("You rolled a " + roll3 + ".", POKER_LOC, canvas);
		} else if (roll2 == roll3) {
			ceeLoHand = new Text("You rolled a " + roll1 + ".", POKER_LOC, canvas);
		} else if (roll1 == roll3) {
			ceeLoHand = new Text("You rolled a " + roll2 + ".", POKER_LOC, canvas);
		} else if ((roll1 == 4 && roll2 == 5 && roll3 == 6) || (roll1 == 4 && roll2 == 6 && roll3 == 5)
				|| (roll1 == 5 && roll2 == 4 && roll3 == 6) || (roll1 == 5 && roll2 == 6 && roll3 == 4)
				|| (roll1 == 6 && roll2 == 4 && roll3 == 5) || (roll1 == 6 && roll2 == 5 && roll3 == 4)) {
			ceeLoHand = new Text("You rolled a 4 5 6! You Win!", POKER_LOC, canvas);
		} else if ((roll1 == 1 && roll2 == 2 && roll3 == 3) || (roll1 == 1 && roll2 == 3 && roll3 == 2)
				|| (roll1 == 2 && roll2 == 1 && roll3 == 3) || (roll1 == 2 && roll2 == 3 && roll3 == 1)
				|| (roll1 == 3 && roll2 == 1 && roll3 == 2) || (roll1 == 3 && roll2 == 2 && roll3 == 1)) {
			ceeLoHand = new Text("You rolled a 1 2 3! You Lose!", POKER_LOC, canvas);
		} else {
			ceeLoHand = new Text("Roll again!", POKER_LOC, canvas);

		}

		reRoll = new Text("(Remove mouse to reset.)", REROLL_LOC, canvas);
		playAgain.hide();
	}

	

}
