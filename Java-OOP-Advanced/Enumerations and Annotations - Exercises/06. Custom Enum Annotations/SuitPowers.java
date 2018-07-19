package customEnumAnnotation;
@CustomEnumAnnotation(category = "Suit", description = "Provides suit constants for a Card class.")
public enum  SuitPowers {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);
    int suitPowers;

    SuitPowers(int suitPowers) {
        this.suitPowers = suitPowers;
    }

    public int getSuitPowers() {
        return suitPowers;
    }
}
