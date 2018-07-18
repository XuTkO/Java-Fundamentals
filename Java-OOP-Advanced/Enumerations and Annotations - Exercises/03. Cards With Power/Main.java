package enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number = bf.readLine();
        String suit = bf.readLine();


        System.out.printf("Card name: %s of %s; Card power: %d",Enum.valueOf(RankPowers.class,number),
                Enum.valueOf(SuitPowers.class,suit),Enum.valueOf(RankPowers.class,number).getRankPowers() +
                        Enum.valueOf(SuitPowers.class,suit).getSuitPowers());



    }
}
