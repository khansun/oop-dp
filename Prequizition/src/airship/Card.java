package airship;

import java.io.Serializable;
import java.util.Comparator;

/**
 * To model the playing card.
 *
 */
public class Card implements Serializable, Comparable<Card> {

    private static final long serialVersionUID = 100;

    /**
     * All possible ranks of a Card.
     */
    public enum Rank {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
        EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10),
        KING(10), ACE(11);

        private final int value; //value of a rank
        private static Rank[] values = values(); //all ranks

        /**
         *
         * @param value The value of the rank.
         */
        Rank(int value) {
            this.value = value;
        }

        /**
         *
         * @return The value of the rank.
         */
        public int getValue() {
            return this.value;
        }

        /**
         *
         * @return The next Card rank.
         */
        public Rank getNext() {
            return values[(this.ordinal() + 1) % values.length];
        }
    }

    /**
     * All possible suits of a Card.
     */
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    };

    private Rank rank;
    private Suit suit;

    /**
     * @param rank The rank of this Card.
     * @param suit The suit of this Card.
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * @return The rank of this Card.
     */
    public Rank getRank() {
        return this.rank;
    }

    /**
     * @return The suit of this Card.
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     *
     * @return The string value of this Card in format <Rank> OF <Value>.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.rank.toString()).append(" OF ")
                .append(this.suit.toString());

        return sb.toString();
    }

    /**
     * @param card1 First Card that you want to compare.
     * @param card2 The second Card that you want to compare to the first.
     * @return The difference in value
     */
    public static int differenceValue(Rank card1, Rank card2) {
        return (card1.value > card2.value) ? card1.value - card2.value
                : card2.value - card1.value;
    }

    /**
     * @param card1 First Card that is to be compared.
     * @param card2 The second Card that is to be compared to the first.
     * @return The difference in value.
     */
    public static int difference(Rank card1, Rank card2) {
        return (card1.ordinal() > card2.ordinal()) ? card1.ordinal()
                - card2.ordinal()
                : card2.ordinal() - card1.ordinal();
    }

    /**
     * @param compareCard Card that is to be compared.
     * @return Difference
     */
    @Override
    public int compareTo(Card compareCard) {
        int comparison = this.rank.ordinal() - compareCard.rank.ordinal();
        if (comparison == 0) {
            comparison = this.suit.ordinal() - compareCard.suit.ordinal();
        }
        return comparison;
    }

    /**
     * Compare Cards in descending order.
     */
    public static class CompareDescending implements Comparator<Card> {

        /**
         * @param card1 First Card that you want to compare.
         * @param card2 The second Card that you want to compare to the first.
         * @return 1 if First Card > Second Card, -1 if Second > First, 0 if
         * they are equal.
         */
        @Override
        public int compare(Card card1, Card card2) {
            int comparison = -1 * (card1.rank.ordinal() - card2.rank.ordinal());
            if (comparison == 0) {
                comparison = card1.suit.ordinal() - card2.suit.ordinal();
            }
            return comparison;
        }
    }

    /**
     * Compare Cards in ascending order.
     */
    public static class CompareSuit implements Comparator<Card> {

        /**
         * @param card1 First Card that you want to compare.
         * @param card2 The second Card that you want to compare to the first.
         * @return -1 if First Card > Second Card, -1 if Second > First, 0 if
         * they are equal.
         */
        @Override
        public int compare(Card card1, Card card2) {
            int comparison = card1.suit.ordinal() - card2.suit.ordinal();
            if (comparison == 0) {
                comparison = card1.rank.ordinal() - card2.rank.ordinal();
            }
            return comparison;
        }
    }
    /*****************************************************************
    * TEST MAIN METHOD
    public static void main(String[] args) {
        Card card = new Card(Rank.TWO,Suit.DIAMONDS);
        System.out.println("getRank() " + card.getRank());
        System.out.println("getSuit() " + card.getSuit());
        System.out.println("getNext() " + card.getRank().getNext());
        System.out.println("Card: " + card);
        System.out.println("Difference in value: " + card.differenceValue(Rank.TEN, Rank.QUEEN));
        System.out.println("Difference in rank: " + card.difference(Rank.TEN, Rank.QUEEN));
        System.out.println("Compare to: " + card.compareTo(new Card(Rank.THREE, Suit.DIAMONDS)));
    }
    *******************************************************************/
}
