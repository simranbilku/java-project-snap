package org.cardgame;

public class Main {
    public static void main(String[] args) {
        CardGame game = new CardGame("My Card Game");
        game.getDeck();
        game.dealCard();
    }
}
