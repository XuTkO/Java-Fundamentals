package Tuple;

public class Tuple<F,S> {
    private F firstItem;
    private S secondItem;

    public Tuple(F firstItem, S secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s -> %s",firstItem,secondItem));

        return sb.toString();
    }
}
