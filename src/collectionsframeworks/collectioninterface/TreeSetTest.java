package collectionsframeworks.collectioninterface;
import java.util.NavigableSet;
import java.util.TreeSet;


public class TreeSetTest {
    public static void main(String[] args){
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(2);
        navigableSet.add(3);
        navigableSet.add(4);
        navigableSet.add(1);

        System.out.println(navigableSet);
        System.out.println(navigableSet.floor(2));
        System.out.println(navigableSet.higher(2));
        System.out.println(navigableSet.ceiling(2));

    }
}
