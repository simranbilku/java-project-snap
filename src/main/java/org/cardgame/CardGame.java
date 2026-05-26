package org.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {

    private ArrayList<Card> deckOfCards = new ArrayList<Card>();
    private String name;

    public CardGame(String name) {
        this.name = name;
        String[] symbol = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        for (Suit s : Suit.values()) {
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

    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

}

