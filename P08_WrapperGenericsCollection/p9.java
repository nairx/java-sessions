package P08_WrapperGenericsCollection;

import java.util.*;

public class p9 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("John");
        deque.addFirst("Amy");
        deque.addLast("Cathy");
        // System.out.println(deque.poll());
        while (!deque.isEmpty()){
            System.out.println(deque.poll());
        }
        

    }
}
