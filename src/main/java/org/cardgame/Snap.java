package org.cardgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {

    public Snap(String name) {
        super(name);
    }

    public ArrayList<Card> playSnap() {
        boolean win = false;
        Card previousCard = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to take your turn.");

        while (!win) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                Card currentCard = dealCard();
                System.out.println(currentCard);
                if (previousCard != null && previousCard.getSymbol().equals(currentCard.getSymbol())) {
                    win = true;
                    System.out.println("You win!");
                } else {
                    previousCard = currentCard;
                    System.out.println("Press enter to take the next turn.");
                }
            } else {
                System.out.println("Try again. Press enter to take your turn.");
            }
        } return null;
    }
}
