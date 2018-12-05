package Queues;
//override add method for linkedlist
//have to use Item for stack/queue

import javax.naming.Name;
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
            Item itemCheckout = checkoutLane.poll();
            Item item = items[i];
            System.out.println(item.getItemName() + "\t\t" + formatter.format(item.getPrice()) + "\t" +
                    item.getSize());
            checkoutLane.add(itemCheckout);
        }
    }

    public void bagItems()
    {
        ArrayList<Item> large = new ArrayList<>();
        ArrayList<Item> medium = new ArrayList<>();
        ArrayList<Item> small = new ArrayList<>();


        int size = checkoutLane.size();

        for (int i = 0; i < size; i++) {

            Item item = checkoutLane.poll();
            if (item.getSize().equalsIgnoreCase("large"))
            {
                large.add(item);
            }
            if (item.getSize().equalsIgnoreCase("medium"))
            {
                medium.add(item);
            }
            if (item.getSize().equalsIgnoreCase("small"))
            {
                small.add(item);
            }
        }

        System.out.println("Large Items:\t\tPrice:");
        System.out.println("============\t\t======");
        for(int l = 0; l < large.size(); l++)
        {
            System.out.println(large.get(l).getItemName() + "\t\t" + large.get(l).getPrice());
        }
        System.out.println("\n");

        System.out.println("Medium Items:\tPrice:");
        System.out.println("============\t======");
        for(int l = 0; l < medium.size(); l++)
        {
            System.out.println(medium.get(l).getItemName() + "\t" + medium.get(l).getPrice());
        }
        System.out.println("\n");


        System.out.println("Small Items: \tPrice:");
        System.out.println("============ \t======");
        for(int l = 0; l < small.size(); l++)
        {
            System.out.println(small.get(l).getItemName() + "\t" + small.get(l).getPrice());
        }
        System.out.println("\n");
    }
}