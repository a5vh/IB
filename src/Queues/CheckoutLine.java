package Queues;
//override add method for linkedlist
//have to use Item for stack/queue
import java.util.*;

public class CheckoutLine {

    public double totalPrice;

    Queue<Item> checkoutLane = new LinkedList<>();
    Stack wowStack = new Stack();

    public CheckoutLine(Queue checkout, Stack stack)
    {
        totalPrice = 0.0;
        this.checkoutLane = checkout;
        this.wowStack = stack;
    }

    public CheckoutLine()
    {}


    public void stackToQueue(Stack cart)
    {
        for (int i = 0; i < cart.size(); i++)
        {
            checkoutLane.offer(wowStack.pop());
        }
    }

    public void printCheckout()
    {
        System.out.println("\nAmount of items: " + checkoutLane.size());

        System.out.println("Items from the top of the cart to the bottom.");

        for (int i = 0; i < checkoutLane.size(); i++)
        {
            System.out.println(checkoutLane.poll().getItemName());
        }
    }

}