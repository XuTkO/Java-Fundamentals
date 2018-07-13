package generuc;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable<T>> {
       private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int returnInteger(List<T> list, T control){
        int counter = 0 ;
        for (T t : list) {
            if(t.compareTo(control) > 0){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(String.format("java.lang.Integer: %s%n",t));
        }

        return sb.toString();
    }
}
