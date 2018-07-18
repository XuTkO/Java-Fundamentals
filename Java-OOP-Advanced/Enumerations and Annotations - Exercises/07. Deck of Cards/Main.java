package enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        for (SuitPowers suitPowers : SuitPowers.values()) {
            for (RankPowers rankPowers : RankPowers.values()) {
                System.out.println(rankPowers.toString() + " of " +  suitPowers.toString());
            }
        }

    }
}
