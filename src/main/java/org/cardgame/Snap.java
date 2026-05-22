package org.cardgame;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;

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
        System.out.println(player1.getName() + ": Press enter to take your turn." );

        while (!win) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                Card currentCard = dealCard();
                System.out.println(currentCard);

                if (previousCard != null && previousCard.getSymbol().equals(currentCard.getSymbol())) {
                    System.out.println("Type snap in 2 seconds to win...");

                    String snapInput = null;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Scanner winScanner = new Scanner(System.in);
                    Future<String> future = executor.submit(winScanner::nextLine);

                    try {
                        snapInput = future.get(2, TimeUnit.SECONDS);
                    } catch (TimeoutException | InterruptedException | ExecutionException e) {
                        System.out.println("You didn't type snap in time!");
                        future.cancel(true);
                    } finally {
                        executor.shutdownNow();
                    }

                    if ("snap".equals(snapInput)) {
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

// add timer -> when snap opportunity player has 2 seconds submit the word "snap"
// if player doesn't type it in time, they lose

// ExecutorService runs Scanner.nextLine() in a separate thread so the main thread can enforce a timeout
// Future.get(timeout, unit)
// if timeout expires it returns default value
// uses future.cancel(true) to interrupt the input thread after timeout
