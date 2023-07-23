package collectionsframeworks;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class OurGenericList<T> implements Iterable{
    private T[] items;
    private int size;

    public OurGenericList(){
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item){
        items[size++] = item;
    }

    public T getItemAtIndex(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new OurGenericIterator(this);
    }

    private class OurGenericIterator implements Iterator<T>{
        private OurGenericList<T> list;
        private int index = 0;
        public OurGenericIterator(OurGenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext(){
            return index < list.size;
        }

        @Override
        public T next(){
            return list.items[index ++];
        }
    }
}
