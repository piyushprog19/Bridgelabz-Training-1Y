package Queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class deque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("Ichigo Kurosaki");
        deque.offer("Shutara Senjimaru");
        deque.offer("Ichibe Hyosube");
        deque.offer("Kisuke Urahara");
        deque.offer("Shunshui Kyoraku");
        System.out.println("deque is :- " +  deque);
        while (!deque.isEmpty()){
            System.out.println(deque.poll());

        }
        System.out.println("deque is :- " +  deque);
    }
}
