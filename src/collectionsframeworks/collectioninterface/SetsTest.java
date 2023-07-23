package collectionsframeworks.collectioninterface;
import java.util.Set;
import java.util.HashSet;


public class SetsTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println(set);
        System.out.println(set2);

        // set.retainAll(set2); // Intersection
        set.removeAll(set2); // Difference
        // set.addAll(set2); // Union

        System.out.println(set);
        System.out.println(set2);

        for (int x: set){
            System.out.println(x);
        }
    }
}
