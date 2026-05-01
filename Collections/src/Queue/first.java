package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class first {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("Orihime Inoue");
        pq.add("Ichigo Kurosaki");
        pq.add("Kisuke Urahara");
        pq.add("Kenpachi Zaraki");
        pq.add("Ichibe Hyosube");
        System.out.println(pq);
        System.out.println(pq.element());
        System.out.println(pq.peek());

        System.out.println(pq.poll());
        System.out.println(pq);
        pq.offer("Shutara Senjimaru");
        System.out.println(pq);
    }
}
