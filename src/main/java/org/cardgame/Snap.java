package org.cardgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");

    public Snap(String name) {
        super(name);
    }

    public ArrayList<Card> playSnap() {
        boolean win = false;
        boolean isPlayer1Turn = true;
        Card previousCard = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println(player1.getName() + ": Press enter to take your turn.");

        while (!win) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                Card currentCard = dealCard();
                System.out.println(currentCard);
                if (previousCard != null && previousCard.getSymbol().equals(currentCard.getSymbol())) {
                    System.out.println("type snap to win...");
                    String snapInput = scanner.nextLine();
                    if (snapInput.equals("snap")) {
                        win = true;
                        if (isPlayer1Turn) {
                            System.out.println(player1.getName() + ": You win!");
                        } else {
                            System.out.println(player2.getName() + ": You win!");
                        }
                    }
                } else {
                    previousCard = currentCard;
                    isPlayer1Turn = !isPlayer1Turn;
                    if (isPlayer1Turn) {
                        System.out.println(player1.getName() + ": Press enter to take your turn.");
                    } else {
                        System.out.println(player2.getName() + ": Press enter to take your turn.");
                    }
                }
            } else {
                System.out.println("Try again. Press enter to take your turn.");
            }
        } return null;
    }
}

