package com.baris;

import java.util.Scanner;

import static com.baris.Card.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        assert Card.rankToString(ACE) =="Ace";

        assert Card.rankToString(DEUCE) == "Deuce";
        assert Card.rankToString(THREE) == "Three";
        assert Card.rankToString(FOUR) == "Four";
        assert Card.rankToString(FIVE) == "Five";
        assert Card.rankToString(SIX) == "Six";
        assert Card.rankToString(SEVEN) == "Seven";
        assert Card.rankToString(EIGHT) == "Eight";
        assert Card.rankToString(NINE) == "Nine";
        assert Card.rankToString(TEN) == "Ten";
        assert Card.rankToString(JACK) == "Jack";
        assert Card.rankToString(QUEEN) == "Queen";
        assert Card.rankToString(KING) == "King";

        assert Card.suitToString(DIAMONDS) == "Diamonds";
        assert Card.suitToString(CLUBS) == "Clubs";
        assert Card.suitToString(HEARTS) == "Hearts";
        assert Card.suitToString(SPADES) == "Spades";

        Deck deck = new Deck();

        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                        card.rankToString(card.getRank()),
                        card.suitToString(card.getSuit()));
            }
        }

    }
}
