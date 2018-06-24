package bookShop;

public class GoldenEditionBook extends Book {


    public GoldenEditionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+0.3*super.getPrice();
    }

    @Override
    public String toString() {
        return String.format("Type: GoldenEditionBook%nTitle: %s%nAuthor: %s%nPrice: %.1f",super.getTitle(),super.getAuthor(),this.getPrice());
    }
}
