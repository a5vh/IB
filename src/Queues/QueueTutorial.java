package Queues;
import java.util.*;

public class QueueTutorial {

    public static void main(String [] args) {

        Queue<String> q1 = new LinkedList<String>();

        q1.offer("Cat");
        q1.offer("Dog");
        q1.offer("Fish");

        System.out.println(q1.poll());

        System.out.println(q1.peek());
    }
}
