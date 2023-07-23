package collectionsframeworks.collectioninterface;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.List;


public class PriorityQueueTest {
    public static void main(String[] args){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(0);
        priorityQueue.offer(100);
        System.out.println(priorityQueue);

        List<StudentMarks> studentMarks = new ArrayList<>();
        studentMarks.add(new StudentMarks(70, 80));
        studentMarks.add(new StudentMarks(38, 10));
        studentMarks.add(new StudentMarks(100, 30));
        studentMarks.add(new StudentMarks(40, 88));
        studentMarks.add(new StudentMarks(97, 19));

        PriorityQueue<StudentMarks> priorityQueue1 = new PriorityQueue<>(studentMarks);

        List<StudentMarks> top3 = new ArrayList<>();
        int index = 0;
        while (!priorityQueue1.isEmpty()){
            if (index == 3){
                break;
            }

            top3.add(priorityQueue1.poll());
            index++;
        }
        System.out.println(top3);

//        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(new MyCustomComparator()); // using comparator
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>((a, b) -> b -a); // using lambda

        priorityQueue2.offer(1);
        priorityQueue2.offer(2);
        priorityQueue2.offer(0);
        priorityQueue2.offer(100);
        System.out.println(priorityQueue2);
        System.out.println(priorityQueue2.poll());
        System.out.println(priorityQueue2.poll());
        System.out.println(priorityQueue2.poll());
        System.out.println(priorityQueue2.poll());
    }


}

class StudentMarks implements Comparable<StudentMarks> {
    private int maths;
    private int physics;

    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }

    @Override
    public int compareTo(StudentMarks studentMarks) {
        // current object < other object return -1
        // current object > other object return 1
        // current object == other object return 0
//        if (this.maths < studentMarks.maths)
//            return -1;
//        if (this.maths > studentMarks.maths)
//            return 1;
//        if (this.maths == studentMarks.maths)
//            return 0;
        return this.maths - studentMarks.maths;
    }
}

