package org.cardgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {

    public Snap(String name) {
        super(name);
    }

    public ArrayList<Card> playSnap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to take your turn.");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            dealCard();
        } else {
            System.out.println("Try again. Press enter to take your turn.");
        }
        return null;
    }

    // by pressing enter in the command line, the user takes their turn
    // each turn, a new card is dealt from the deck
    // the game continues until two cards in a row have the same symbol
    // at which point the "player" wins and the game ends

}
