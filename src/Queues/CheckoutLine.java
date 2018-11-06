package Queues;
//override add method for linkedlist
//have to use Item for stack/queue
import java.util.*;

public class CheckoutLine {

    public double totalPrice;

    Queue<Object> checkoutLane = new LinkedList<>();

    public CheckoutLine()
    {
        totalPrice = 0.0;
    }

    public void stackToQueue(Stack cart)
    {
        for (int i = 0; i < cart.size(); i++)
        {
            checkoutLane.add(cart.pop());

        }
    }
}