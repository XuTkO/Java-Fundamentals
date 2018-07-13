package custom_list;

import java.util.List;

public interface MyList<T extends Comparable<T>> {

    List<T> getList();

    void add(T element);

    T remove(int index);

    boolean contains(T element);

    void swap(int index1, int index2);

    int countGreaterThan(T element);

    T getMax();

    T getMin();

    void sort();


}
