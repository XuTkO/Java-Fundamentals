package generuc;

import java.util.ArrayList;
import java.util.List;

public class Box <T> {
       private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public List<T> returnSwapped(List<T> list, int[] nums){
        T firstSwap = list.get(nums[0]);
        T secondSwap = list.get(nums[1]);
        list.remove(nums[0]);
        list.add(nums[0],secondSwap);
        list.remove(nums[1]);
        list.add(nums[1],firstSwap);

        return list;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(String.format("java.lang.String: %s%n",t));
        }

        return sb.toString();
    }
}
