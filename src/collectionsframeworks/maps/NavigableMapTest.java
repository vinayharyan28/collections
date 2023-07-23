package collectionsframeworks.maps;

import java.util.*;

public class NavigableMapTest {
    public static void main(String[] args) {
        NavigableMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "vinay");
        treeMap.put(2, "jon");
        treeMap.put(3, "gon");

        System.out.println(treeMap);

        Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry: entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
