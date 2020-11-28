import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    private LinkedList<Card> cards;

    public Deck() {
        newDeck();
    }

    public Card draw() {
        return cards.removeFirst();
    }

    public Card drawBottom() {
        return cards.removeLast();
    }

    public void put(Card card) {
        cards.addFirst(card);
    }

    public void putBottom(Card card) {
        cards.addLast(card);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int cardsInDeck() {
        return cards.size();
    }

    public void newDeck() {
        cards = new LinkedList<>();
        for (CardRank rank : CardRank.values()) {
            for (CardValue value : CardValue.values()) {
                cards.add(new Card(value, rank));
            }
        }
    }
}
