import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("0");
        deque.add("1");
        deque.addLast("2");
        System.out.println(deque);
        deque.descendingIterator();

    }

}
