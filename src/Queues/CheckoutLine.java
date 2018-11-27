package Queues;
//override add method for linkedlist
//have to use Item for stack/queue

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class CheckoutLine {

    public double totalPrice;

    Queue<Item> checkoutLane = new LinkedList<>();
    Stack<Item> wowStack = new Stack<>();

    NumberFormat formatter = new DecimalFormat("$#.00");

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

        System.out.println("Name:  \t\tPrice: \tSize:");
        System.out.println("=======\t\t=======\t=======");

        Item[] items = new Item[checkoutLane.size()];

        for (int i = 0; i < items.length; i++)
        {
            Item item = checkoutLane.poll();
            items[i] = item;
            checkoutLane.add(item);
        }

        for (int i = 0; i < items.length; i++)
        {
            if (items[i].getSize().compareTo(items[i+1].getSize()) == 0)
            {

            }

            if (items[i].getSize().compareTo(items[i+1].getSize()) < 0)
            {
                int offset = items[i].getSize().compareTo(items[i+1].getSize());
                items[i] = items[i-offset];
            }

            if (items[i].getSize().compareTo(items[i+1].getSize()) > 0)
            {
                int offset = items[i].getSize().compareTo(items[i+1].getSize());
                items[i] = items[i+offset];
            }
        }

        for (int i = 0; i < items.length; i++)
        {
            Item itemCheckout = checkoutLane.poll();
            Item item = items[i];
            System.out.println(item.getItemName() + "\t\t" + formatter.format(item.getPrice()) + "\t" +
                    item.getSize());
            checkoutLane.add(itemCheckout);
        }
    }
}

