package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda expression is just an anonymous(nameless) function.
 * That means the function which doesn't have the name, return type and access modifiers.
 * Lambda expression also known as anonymous functions or closures.
 * Lambda expressions, often denoted by the Greek letter lambda (λ), are a feature introduced in Java 8 to provide a concise way to express instances of single-method interfaces, also known as functional interfaces. Lambda expressions make the code more readable and expressive by reducing the need for boilerplate code when working with interfaces that have only one abstract method.
 * (parameters) -> expression
 * Parameters: A comma-separated list of formal parameter enclosed in parentheses. if the lambda takes no parameters, the parentheses are empty. for example, `() ->`.
 * Arrow(`->`): The arrow operator separates the parameter list from the body of the lambda expression.
 * Expression: The body of the lambda expression, which represents the implementation of the abstract method in the functional interface. If the body contains more than one statement, it is enclosed in curly braces `{}`
 *
 * Arrow(`->`): The arrow operate separates the parameter list from the body of the lambda expression.*/

public class LambdaTesting {
    // Using an anonymous class
    Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello, World!");
        }
    };

    // Using an anonymous class
    Comparator<Integer> comparator1 = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    };

    //Functional interfaces
    //Lambda expression are closely tied to functional interfaces.
    //A functional interface is an interface with a single method. for example.
    @FunctionalInterface
    interface MyFunction{
        int operate(int x, int y);
    }

    /**
     * Key Characteristics
     * 1. Conciseness: Lambda expression are concise and reduce the amount of boilerplate code, making the code more readable.
     * 2. Readability: Lambda expression often amke the code more readable by expression the intention of the code more clearly, especially when used with collections and streams.
     * 3. Functional Programming: Lambda expression support a more functional programming style, where functions can be passed as arguments and treated as first-class citizens.
     * 4. Closure: lambda expressions can capture variables from their enclosing scope the captured variables are effectively final or in other words, should not be modified inside the lambda expression.

     * Use cases:
     * Lambda expressions are commonly used in scenarios where a functional interface is required, such as with the java stream API, even handling, and multithreading.

     * Lambda expression are a powerful feature that significantly enhances the capabilities of java,
     * particularly in modern programming paradigms. They enable a more functional and expressive style of coding, making it easier to work with certain types of constructs and APIs.

     * */

    // Using a lambda expression
    public static void main(String[] args) {
        Runnable runnable2 = () -> System.out.println("Hello word");
        Comparator<Integer> Comparator2 = Integer::compareTo;
        MyFunction addition = Integer::sum;
        System.out.println(addition.operate(2, 3));

        // Example using the Stream API
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names
                .stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

    }


}
