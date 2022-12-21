import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.remove(2);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}