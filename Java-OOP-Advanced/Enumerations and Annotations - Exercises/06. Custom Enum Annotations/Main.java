package customEnumAnnotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String OUTPUT = "Type = %s, Description = %s";
    private static final String RANK_TYPE = "Rank";
    private static final String SUIT_TYPE = "Suit";

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
            if (RANK_TYPE.equals(input)) {
                Class<RankPowers> rankPowersClass = RankPowers.class;
                if (rankPowersClass.isAnnotationPresent(CustomEnumAnnotation.class)){
                    CustomEnumAnnotation annotation = rankPowersClass.getAnnotation(CustomEnumAnnotation.class);
                    System.out.printf(OUTPUT,annotation.type(),annotation.description());
                }
            } else if (SUIT_TYPE.equals(input)){
                Class<SuitPowers> suitPowersClass = SuitPowers.class;
                if (suitPowersClass.isAnnotationPresent(CustomEnumAnnotation.class)){
                    CustomEnumAnnotation annotation = suitPowersClass.getAnnotation(CustomEnumAnnotation.class);
                    System.out.printf(OUTPUT,annotation.type(),annotation.description());
                }
            }

    }
}
