package collectionsframeworks.collectioninterface;

import java.util.ArrayDeque;
import java.util.Deque;


public class DequeueTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
    }
}
