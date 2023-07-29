package concurrencyandmultithreading.thread;


public class StackTest {
    private final int[] array;
    private int stackTop;

    Object lock;

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

    public boolean push(int element) {
        synchronized (lock) {
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


    public int pop() {
        synchronized (lock){
            if (isEmpty()) return Integer.MIN_VALUE;
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
            stackTop--;
            return obj;
        }
    }

}
