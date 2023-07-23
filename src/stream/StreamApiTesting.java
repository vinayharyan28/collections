package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiTesting {
    public static void main(String[] args) {
        // Create a list and filter all even numbers from list
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);
        System.out.println(list1);

        //suing stream
        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i->i%2 ==0).collect(Collectors.toList());
        System.out.println(newList);


    }
}
