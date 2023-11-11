package stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Certainly! The stream API in java provides a concise and expressive way to process collections of data.
 * It allows you to perform operation on a sequence of elements, such as filtering, mapping, and reducing, in a functional style.

 * */
public class StreamAPI {
    public static void main(String[] args) {

        //1.Filtering element
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Kiwi");
        // Using stream API to filter elements starting with 'A'
        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredFruits);
        // `stream()` method is called on the list to obtain a stream of elements.
        // `filter()` is used to specify a condition for elements to be included in the result.
        // `collect(Collectors.toList())` collects the filtered elements into a new list.


        //2. Mapping Elements
        List<String> uppercaseFruits = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseFruits);
        //`Map(String::toUpperCase)` transforms each element to uppercase using the `toUpperCase` method.
        //`collect(Collectors.toList())` collects the transformed elements into a new list.


        //3. Reducing Elements
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
        // `reduce(0, Integer::sum)` performs a reduction on the elements using the binary operator `Integer::sum`. The `0` is the identity value.


        //4. Chaining Operations
        List<String> result = fruits.stream()
                .filter(fruit -> fruit.length() > 3)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(result);
        // Multiple stream operations (`filter` and `map`) are chained together to perform a sequence of transformations on the elements.
        // The final result is collected into a new list.







    }
}
