package org.cardgame;

import java.util.ArrayList;
import java.util.Comparator;

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

    public Card dealCard() {
        return deckOfCards.removeLast();
    }

   public ArrayList<Card> sortDeckInNumberOrder() {
        Comparator<Card> cardComparator = Comparator.comparing(Card::getValue);
        deckOfCards.sort(cardComparator);
        return deckOfCards;
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        Comparator<Card> cardComparator = Comparator.comparing(Card::getSuit).thenComparing(Card::getValue);
        deckOfCards.sort(cardComparator);
        return deckOfCards;
    }

    // ArrayList<Card> sortDeckIntoSuits()
    // Sorts the deck into suits (2,3,4,5,6,7,8,9,10,J,Q,K,A of hearts,
    // then 2,3,4,5,6,7,8,9,10,J,Q,K,A of clubs etc.)
    // stores the new shuffled deck back into the deckOfCards attribute.

   // Comparator<Card> cardComparator = new Comparator<Card>() {
   //     public int compare(Card c1, Card c2) {
   //         return Integer.compare(c1.getValue(), c2.getValue());
   //     }
   // };
}

