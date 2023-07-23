package collectionsframeworks.collectioninterface;
import java.util.LinkedList;
import java.util .List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> lList1 = new LinkedList<>();
        lList1.add(1);
        lList1.add(2);
        lList1.add(3);

        ListIterator<Integer> iterator = lList1.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
    }
}
