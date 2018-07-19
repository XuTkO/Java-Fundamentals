package enums;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Deck implements Iterable<Card>{
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        this.seedDeck();
    }

    private void seedDeck() {
        for (SuitPowers suitPowers : SuitPowers.values()) {
            for (RankPowers rankPowers : RankPowers.values()) {
                Card card = new Card(rankPowers,suitPowers);
                this.cards.add(card);
            }
        }
    }

    @Override
    public void forEach(Consumer<? super Card> action) {
        for (Card card : this) {
            action.accept(card);
        }
    }

    @Override
    public Iterator<Card> iterator() {
        return new DeckIterator();
    }
    private final class DeckIterator implements Iterator<Card> {

        private int cursor =0;

        @Override
        public boolean hasNext() {
            return cards.size() != this.cursor;
        }

        @Override
        public Card next() {
            return cards.get(this.cursor++);
        }
    }
}
