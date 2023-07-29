package concurrencyandmultithreading.thread;


import java.util.Stack;

public class Thread1 extends Thread{
    public Thread1(String threadName){
        super(threadName);
    }
    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Thread: "+ Thread.currentThread().getName() + "-----" + i);
        }
    }
}
