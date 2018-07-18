package enums;

public class Main {
    public static void main(String[] args) {
        String input = "Card Suits";

        System.out.println("Card Suits:");
        for (Suits suits : Suits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",suits.ordinal(),suits.name());
        }

    }
}
