package lambda;

public class ThreadDemo {
    public static void main(String[] args) {
        // first thread
        Runnable thread1 = () -> {
            // this is body of the thread
            // stuff
            for (int i=1; i<=10; i++){
                System.out.println("value of i is " + i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("JOHN");
        t.start();

    }
}
