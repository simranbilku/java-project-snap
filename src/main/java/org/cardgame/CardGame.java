package org.cardgame;

import java.util.ArrayList;

public class CardGame {

    private ArrayList<Card> deckOfCards = new ArrayList<Card>();
    private String name;

    public CardGame(String name) {
        this.name = name;
        String[] suit = {"♥","♦","♣","♠"};
        String[] symbol = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        for (String s : suit) {
            for (int j = 0; j < symbol.length; j++) {
                Card myCard = new Card(s, symbol[j], value[j]);
                deckOfCards.add(myCard);
            }
        }
    }

    public ArrayList<Card> getDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card.toString());
        }
        return deckOfCards;
    }
}
