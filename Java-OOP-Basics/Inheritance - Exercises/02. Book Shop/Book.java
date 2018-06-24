package bookShop;

public class Book {
    private String author;
    private String title;
    private double price;


    public Book(String author, String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.length() < 3){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.matches("[a-zA-Z]+ [0-9][a-zA-Z]+")){
                throw new IllegalArgumentException("Author not valid!");

        }
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }


    @Override
    public String toString() {
        return String.format("Type: Book%nTitle: %s%nAuthor: %s%nPrice: %.1f%n",this.title,this.author,this.price);
    }
}
