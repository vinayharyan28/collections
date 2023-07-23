package collectionsframeworks.collectioninterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(0);
        System.out.println(linkedHashSet); // Insertion in ordered
        System.out.println(linkedHashSet.contains(1));
        System.out.println(linkedHashSet.contains(5));
    }
}
