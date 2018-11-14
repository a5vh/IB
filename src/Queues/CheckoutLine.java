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
        int size = cart.size();
        for (int i = 0; i < size; i++)
        {
            checkoutLane.add(wowStack.pop());
        }
    }

    public void printCheckout()
    {
        System.out.println("\nAmount of items: " + checkoutLane.size());

        System.out.println("Name:  \tPrice: ");
        System.out.println("=======\t=======");

        int size = checkoutLane.size();

        for (int i = 0; i < size; i++)
        {
            Item item = checkoutLane.poll();
            System.out.println(item.getItemName() + "\t" + item.getPrice());
            checkoutLane.add(item);
        }
        }
    }
