package stackIterator;

import java.util.*;

public class Stack<T> implements Iterable<T>{
    private List<T> elements;
    private int elementCount ;

    public Stack() {
        this.elements = new ArrayList<>();
    }

    public void push(T element){
        this.elements.add(elementCount++, element);

    }

    public T pop(){
        if (this.elementCount ==0){
            throw new NoSuchElementException();
        }
        T element =  this.elements.get(--elementCount);
        this.elements.remove(elementCount);
        return element;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }
    private  final class StackIterator implements Iterator<T>{
        private int cursor;

        public StackIterator() {
            this.cursor = elementCount - 1;
        }



        @Override
        public boolean hasNext() {
            return this.cursor >= 0;
        }

        @Override
        public T next() {
            return elements.get(cursor--);
        }
    }



}
