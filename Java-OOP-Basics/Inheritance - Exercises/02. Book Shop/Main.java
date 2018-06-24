package bookShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Book book = null;
        GoldenEditionBook goldenEditionBook = null;
        try {
            String author = bf.readLine();
            String title = bf.readLine();
            double price = Double.parseDouble(bf.readLine());

            book = new Book(author,title,price);

            goldenEditionBook = new GoldenEditionBook(author,title,price);


        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        if (book!=null) {
            System.out.println(book);
            System.out.println(goldenEditionBook);
        }

    }
}
