package concurrencyandmultithreading.thread;

public class Main {
    public static void main(String[] args){
//        System.out.println("main is starting");
//        Thread thread1 = new Thread1("thread1");
//        thread1.start();
//        Thread thread2 = new Thread(()->{
//            for (int i=0; i<5; i++){
//                System.out.println(Thread.currentThread() + " ," + i);
//            }
//        }, "threadL");
//        thread2.start();
//        System.out.println("main is exiting");

        StackTest stackTest = new StackTest(5);
        new Thread(()-> {
            int counter = 0;
            while (++counter < 10){
                System.out.println("pushed: " + stackTest.push(100));
            }
        }, "Pusher").start();


        new Thread(()-> {
            int counter = 0;
            while (++counter < 10){
                System.out.println("popped: " + stackTest.pop());
            }
        }, "Popper").start();
    }

    // same time increase & decrease
    // use synchronize for avoid this issue

}
