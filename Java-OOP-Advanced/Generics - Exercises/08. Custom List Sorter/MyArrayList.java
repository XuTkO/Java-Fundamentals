package custom_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private List<T> list;

    public MyArrayList() {
        this.list = new ArrayList<>();
    }
    @Override
    public List<T> getList() {
        return this.list;
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
        return this.list.contains(element);
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
        return this.list.stream().filter(x->x.compareTo(element) > 0)
                .collect(Collectors.toList())
                .size();
    }

    @Override
    public T getMax() {
      return  Collections.max(this.list);
    }

    @Override
    public T getMin() {
       return Collections.min(this.list);
    }

    @Override
    public void sort() {

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
