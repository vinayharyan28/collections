package doublecolonoperator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * The double colon operator `::` is known as the method reference operator.
 * It is used to call a method by referring to it with the helps of its class directly.
 * It is a shorthand notation introduced in java 8 to simplify the lambda expressions.
 * The primary use of the double colon operator is to improve the readability of the code.

 * In these examples, I've used functional interface (`Function`, `Consumer`, and `Supplier`) to demonstrate the usage of method reference.
 * The `apply`, `accept`, and `get` methods are called on instance of these functional interfaces to showcase the actual execution of the method reference.
 * The double colon operator is especially useful in scenarios where a lambda expression is used only to call an existing method.
 * It helps to make the code more concise and expressive. However, it's important to note that not all lambda expressions can be replaced by method references, and they are not suitable for all situations.
 * Method references are a syntactic sugar to simplify the usage of lambdas in specific scenarios.
 * */
public class DoubleColonOperator {
    public static void main(String[] args) {
        // 1. Reference to a static method, Syntax: `ClassName::StaticMethodName`
        // Using lambda expression
        Function<String, Integer> lambdaFunction = (from) -> Integer.parseInt(from);
        System.out.println(lambdaFunction.apply("123"));
        // Using method reference
        Function<String, Integer> referenceMethod = Integer::parseInt;
        System.out.println(referenceMethod.apply("123"));

        //2. Reference to an instance method of a particular object. Syntax `Object::instanceMethode`
        Consumer<String> lambdaConsumer = (s) -> System.out.println(s);
        lambdaConsumer.accept("Lambda expression");
        // Using method reference
        Consumer<String> referenceConsumer = System.out::println;
        referenceConsumer.accept("Method reference");

        //3. Reference to an instance method of an arbitrary object of a particular type: Syntax: `ClassName::instanceMethodName`
        Function<String, Integer> lambdaFunction2 = (s) -> s.length();
        System.out.println(lambdaFunction2.apply("Lambda"));

        Function<String, Integer> referenceFunction2 = String::length;
        System.out.println(referenceFunction2.apply("Reference"));

        //Reference to a constructor: Syntax: `ClassName::new`
        Supplier<List<String>> lambdaSupplier = () -> new ArrayList<>();
        List<String> listLambda = lambdaSupplier.get();

        //Using method reference
        Supplier<List<String>> referenceSupplier = ArrayList::new;
        List<String> listReference = referenceSupplier.get();



    }
}
