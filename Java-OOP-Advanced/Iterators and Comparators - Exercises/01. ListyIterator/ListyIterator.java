package exerc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListyIterator<list> {
    private list[] stringList;
    private int index;

    public ListyIterator(list... args) {
        this.stringList = args;
    }

    public boolean move(){
        if (hasNext()){
            index++;
            return true;
        }
        return false;
    }


    public boolean hasNext(){
        if (stringList!=null) {
            return this.index < stringList.length - 1;
        } else {
            return false;
        }
    }


    public void print() {
        if (stringList.length > 0) {
            System.out.println(stringList[index]);
        } else {
            System.out.println("Invalid Operation!");
        }
    }
}

