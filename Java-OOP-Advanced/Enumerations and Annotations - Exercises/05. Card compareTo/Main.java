package enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String number1 = bf.readLine();
        String suit1 = bf.readLine();
        Card card1 = new Card(number1,suit1);
        String number2 = bf.readLine();
        String suit2 = bf.readLine();
        Card card2 = new Card(number2,suit2);

        if(card1.compareTo(card2) > 0){
            System.out.println(card1);
        } else {
            System.out.println(card2);
        }

    }
}
