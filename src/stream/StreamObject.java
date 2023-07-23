package stream;

import java.util.Objects;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // Stream API - collection process
        // collection / group of object

        //1-blank
        Stream<Object> emptyStream = Stream.empty();

        //2- array
        String[] names = {"Vinay", "Ashok", "Ankit"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        //3
        Stream<Object> streamBuilder = Stream.builder().build();

        //
    }
}

