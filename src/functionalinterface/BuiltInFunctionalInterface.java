package functionalinterface;

import java.util.function.*;

/**
 * Java provides a set of built-in functional interface in the `java.util.function` package, introduced in java 8.
 * These interfaces represent common functional constructs and are designed to be used with lambda expressions.
 * Here are some of the key built-in functional interface:

 * Predicate:
 * Purpose: Represents a predicate (boolean-valued function) of one argument.
 * Method: `boolean test(T t);`

 * Function:
 * Purpose: Represents a function that one argument and produces a result.
 * Method: `R apply(T t)`

 * Suppler: Represents a supplier of results
 * Methods: `T get():`

 * Consumer:
 * Purpose: Represents an operation that accepts a single input argument and return to result.
 * Method: `void accept(T t);`

 * UnaryOperator and BinaryOperator
 * UnaryOperator:
 * Purpose: Represents a single operand that produces a result of the same type as its operand.
 * Method: `T apply(T t);`

 * BinaryOperator
 * Purpose: Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
 * Method: `T apply(T t1, T t2)

 * BiPredicate, BiFunction, and BiConsumer:
 * BiPredicate:
 * Purpose: Represents a predicate (boolean-valued function) of two arguments.
 * Method: `boolean test(T t, U u)

 * BiFunction:
 * Purpose: Represents a function that takes two arguments and produces a result.
 * Method: `R apply(T t, U u)`

 * BiConsumer:
 * Purpose: Represents a function that takes two arguments and produce a result.
 * Method: `void accept(T t, U u);`

 * Function combinators:
 * Java provides several methods in the `Function` interface that allow you to combine and chain functions:
 * `andThen(Function after)`: Returns a composed function that first applies the current function and then applies the provided function.
 * `compose(Function before)`: Returns a composed function that first applies the provided function and then applies the current function.

 * These functional interface and methods in the `java.util.function` package are fundamental for working with lambda expression and the stream API, making java code more expressive and readable in a functional programming style.
 */


public class BuiltInFunctionalInterface {
    public static void main(String[] args) {
        //Predicate
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotEmpty.test("Hello"));
        System.out.println(isNotEmpty.test(""));

        //Function
        Function<Integer, String> intToString = i -> "Number: " + i;
        System.out.println(intToString.apply(42));

        //Supplier
        Supplier<Double> randomValue = Math::random;
        System.out.println(randomValue.get());

        //Consumer
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("Hello");

        //UnaryOperator
        UnaryOperator<String> addExclamation = s -> s + "!";
        System.out.println(addExclamation.apply("Hello"));

        //BinaryOperator
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3, 4));


    }
}
