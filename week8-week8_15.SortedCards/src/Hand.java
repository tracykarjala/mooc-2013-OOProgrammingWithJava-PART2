import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(hand);
    }

    public int handCardValue() {
        int handCardValue = 0;
        for (Card card : hand) {
            handCardValue += card.getValue();
        }
        return handCardValue;
    }

    public int handSuitValue() {
        int handSuitValue = 0;
        for (Card card : hand) {
            handSuitValue += card.getSuit();
        }
        return handSuitValue;
    }

    @Override
    public int compareTo(Hand o) {
        return this.handCardValue() - o.handCardValue();
    }

    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }

}