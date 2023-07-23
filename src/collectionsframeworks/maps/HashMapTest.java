package collectionsframeworks.maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("vinay", 1);
        map.put("akshay", 2);
        map.put("sham", 3);

        System.out.println(map.get("vinay"));
        System.out.println(map.getOrDefault("v", 0));
        System.out.println(map.containsKey("vinay"));

        Map<Integer, List<Integer>> adj = new HashMap<>();

        adj.computeIfAbsent(1, f -> new ArrayList<>());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry: entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("-------------------------------------------");

        Set<String> keySet = map.keySet();
        for(String key: keySet){
            System.out.println(key + " " + map.get(key));
        }
    }
}
