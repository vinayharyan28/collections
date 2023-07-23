package collectionsframeworks.collectioninterface;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args){
        List<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);

        aList.set(1, 100);
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(4);
        aList2.add(5);
        aList2.add(6);

        aList2.addAll(aList);
        System.out.println(aList);
        System.out.println(aList2);
        System.out.println(aList2.indexOf(6));

        List<Integer> aList3 = aList2.subList(1, 4);
        System.out.println("aList3 = " + aList3);
        Integer[] arr = aList.toArray(new Integer[0]);
        for (int a: arr){
            System.out.println(a);
        }
    }
}
