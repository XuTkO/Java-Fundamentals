package classBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(bf.readLine());
        double width  = Double.parseDouble(bf.readLine());
        double height = Double.parseDouble(bf.readLine());


        Box box = null;

        try{
            box = new Box(length,width,height);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        if (box!=null) {
            System.out.println(box);
        }
    }
}
