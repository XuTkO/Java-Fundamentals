package generuc;

import java.util.List;

public class Box <T> {
       private T string;

    public Box(T string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return String.format("java.lang.Integer: %d",this.string);
    }
}
