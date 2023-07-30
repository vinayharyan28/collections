package concurrencyandmultithreading.thread;


public class StackTest {
    private final int[] array;
    private int stackTop;

    public StackTest(int capacity) {
        this.array = new int[capacity];
        this.stackTop = -1;
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }

    public synchronized boolean push(int element) {
        synchronized (this){
            if (isFull()) {
                return false;
            }
            ++stackTop;
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
            array[stackTop] = element;
            return true;
        }

    }


    public synchronized int pop() {
        synchronized (this){
            if (isEmpty()) return Integer.MIN_VALUE;
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {}
            stackTop--;
            return obj;
        }
    }

}
