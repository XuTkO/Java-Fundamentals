package enums;

public class Card{
    private RankPowers number;
    private SuitPowers suit;

    public Card(RankPowers number, SuitPowers suit) {
        this.number = number;
        this.suit = suit;
    }


    @Override
    public String toString() {
        return String.format("%s of %s",this.number.name(),this.suit.name());
    }



}
