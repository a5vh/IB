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
            checkoutLane.offer(cart.pop());
        }
    }

    public void printCheckout()
    {
        System.out.println("Amount of items: ");

        System.out.println("Items from the top of the cart to the bottom.");

        for (int i = 0; i < checkoutLane.size(); i++)
        {
            checkoutLane.poll();
        }
    }

}