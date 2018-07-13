package generuc;

import java.util.ArrayList;
import java.util.List;

public class Custom<T extends Comparable<T>> {
    private List<T> list;

    public Custom() {
        this.list = new ArrayList<>();
    }
    public void add(T element){
        this.list.add(element);
    }

    public T remove(int index){
       return this.list.remove(index);
    }

    public boolean contains(T element){
        if (this.list.contains(element)){
            return true;
        }
        return false;
    }
    public void swap(int index1, int index2){
        T firstEl = this.list.get(index1);
        T secondEl = this.list.get(index2);
        this.list.set(index1,secondEl);
        this.list.set(index2,firstEl);
    }

    public int countGreaterThan(T element){
        int counter = 0;
        for (T t : list) {
            if (t.compareTo(element) > 0){
                counter++;
            }
        }
        return counter;
    }

    public T getMax(){
        T max = this.list.get(0);
        for (T t : list) {
            if (t.compareTo(max) > 0){
                max = t;
            }
        }
        return max;
    }
     public T getMin(){
         T min = this.list.get(0);
         for (T t : list) {
             if (t.compareTo(min) < 0){
                 min = t;
             }
         }
         return min;
     }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(t).append(System.lineSeparator());
        }


        return sb.toString();
    }
}
