package functionalinterface;

/**
 * A functional interface in java is an interface that has exactly one abstract method.
 * Functional interfaces are a key concept in java's support for functional programming,
 * and they are closely associated with the introduction of lambda expression in java 8.

 * Here are the key characteristics and rules for functional interfaces.
 * 1. Single abstract method (SAM): A functional interface must contain exactly one abstract method. this method is referred to as the single abstract method or SAM.
 * 2. Functional interfaces annotation: While it's not mandatory, using the `@FunctionalInterface` annotation is a good practice. this annotation ensures that the interface has only one abstract method, helping to catch accidental additions of abstract methods as errors at compile time.
 *
 */
public class FunctionalInterfaceTesting {
    @FunctionalInterface
    interface MyFunctionalInterface{
        void myMethod();
    }

    //Default and Static methods: Functional interfaces can contain and static methods without violating the rule of having a single abstract method.
    //Default and static methods were introduced in java 8 to provide a way to add methods to interfaces without breaking backward  compatibility.

    @FunctionalInterface
    interface MyFunctionalInterface2{
        void myMethod();

        default void myDefaultMethod(){
            // Default implementation
        }

        static void myStaticMethod(){
            // Static method implementation
        }
    }

    //Lambda Expressions: functional interface are intended to be used with lambda expression, providing a concise way to express instance of these interface.
    @FunctionalInterface
    interface MyFunctionalInterface3{
        void myMethod();
    }

    // Built-in-Functional interface
    // Java provides a set of built-in functional interfaces in the java.util.function package,
    // Which includes common use cases like predicates, functions, suppliers, and consumers.
    // Examples include `Predicate`, `Function`, `Supplier`, and `Consumer`.

    public static void main(String[] args) {
        // Using a lambda expression to implement the interface.
        MyFunctionalInterface3 myFunctionalInterface3 = () -> System.out.println("Executing myMethod.");

    }
}
