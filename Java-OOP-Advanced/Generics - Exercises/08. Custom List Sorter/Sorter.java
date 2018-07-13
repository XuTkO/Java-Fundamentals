package custom_list;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {

   public static <T extends Comparable<T>> void sort(MyArrayList<T> list){

       list.getList().sort(Comparable::compareTo);


   }
}
