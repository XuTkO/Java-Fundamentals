package custom_list;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private List<T> list;

    public MyArrayList() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        this.list.add(element);
    }

    @Override
    public T remove(int index) {
       return this.list.remove(index);

    }

    @Override
    public boolean contains(T element) {
        if (this.list.contains(element)){
            return true;
        }
        return false;
    }

    @Override
    public void swap(int index1, int index2) {
        T firstEl = this.list.get(index1);
        T secondEl = this.list.get(index2);
        this.list.set(index1,secondEl);
        this.list.set(index2,firstEl);
    }

    @Override
    public int countGreaterThan(T element) {
        int counter = 0;
        for (T t : list) {
            if (t.compareTo(element) > 0){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public T getMax() {
        T max = this.list.get(0);
        for (T t : list) {
            if (t.compareTo(max) > 0){
                max = t;
            }
        }
        return max;
    }

    @Override
    public T getMin() {
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
