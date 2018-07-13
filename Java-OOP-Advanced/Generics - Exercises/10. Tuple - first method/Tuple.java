package Tuple;

import java.util.ArrayList;
import java.util.List;

public class Tuple<T> {
    List<T> item1;
    List<T> item2;

    public Tuple() {
        this.item1 = new ArrayList<>();
        this.item2 = new ArrayList<>();
    }

    public void setItem1(T item1) {
        this.item1.add(item1);
    }

    public void setItem2(T item2) {
        this.item2.add(item2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int a=0; a < this.item1.size(); a++){
            sb.append(String.format("%s -> %s%n",this.item1.get(a),this.item2.get(a)));
        }


        return sb.toString();
    }
}
