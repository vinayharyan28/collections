package lambda;

@FunctionalInterface
public interface MyInterface {
    public void sayHello();
}

@FunctionalInterface
interface ISum{
    int sum(int a, int b);
}

@FunctionalInterface
interface ILength{
    int getLength(String str);
}
