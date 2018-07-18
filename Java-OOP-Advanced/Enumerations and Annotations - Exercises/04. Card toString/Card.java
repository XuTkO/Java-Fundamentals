package enums;

public class Card {
    private RankPowers number;
    private SuitPowers suit;

    public Card(String number, String suit) {
        this.number = Enum.valueOf(RankPowers.class,number);
        this.suit = Enum.valueOf(SuitPowers.class,suit);
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",this.number.name(),this.suit.name(),
                this.number.getRankPowers() + this.suit.getSuitPowers());
    }
}
