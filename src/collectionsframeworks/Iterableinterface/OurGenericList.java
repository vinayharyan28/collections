package collectionsframeworks.Iterableinterface;
import java.util.Iterator;


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
            System.out.println("has next called");
            return index < list.size;
        }

        @Override
        public T next(){
            System.out.println("next called");
            return list.items[index ++];
        }
    }
}
