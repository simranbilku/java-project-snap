package org.cardgame;

public class Card {
    private Suit suit;
    private String symbol;
    private int value;

    public Card(Suit suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", symbol, suit.getSymbol());
    }
}

