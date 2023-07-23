package lambda;


public class LambdaPractice {
    public static void main(String[] args){
        MyInterface anonymousClass = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("this is first anonymous class");
            }
        };

        anonymousClass.sayHello();

        // using our interface with help of lambda
        MyInterface i = () -> System.out.println("hello lambda");
        i.sayHello();

        ISum sumInter = (a, b) -> (a+b);

        System.out.println(sumInter.sum(2 , 3));

        ILength lengthStr = (str) -> str.length();
        System.out.println(lengthStr.getLength("vinay"));

    }

}
