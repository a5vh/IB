package Queues;
//override add method for linkedlist
//have to use Item for stack/queue
import sun.awt.EventQueueItem;

import java.util.*;

public class CheckoutLine {

    public double totalPrice;

    Queue<Item> checkoutLane = new LinkedList<>();
    Stack<Item> wowStack = new Stack<>();

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
        for (int i = 0; i < cart.size() + 1; i++)
        {
            Item item = wowStack.pop();
            checkoutLane.add(item);
        }
    }

    public void printCheckout()
    {
        System.out.println("\nAmount of items: " + checkoutLane.size());

        System.out.println("Name:  \tPrice: ");
        System.out.println("=======\t=======");


        for (int i = 0; i < checkoutLane.size(); i++)
        {
            Item item = checkoutLane.remove();
            System.out.println(item.getItemName() + "\t" + item.getPrice() + "\t" + checkoutLane.size());
        }
    }

}