package Queues;

import java.util.*;

public class ShoppingCart {

    public int largeBag;
    public int mediumBag;
    public int smallBag;

    Stack<Item> cart = new Stack<>();

    public double totalPrice;

    Queue<Item> checkoutLane = new LinkedList<>();

    public ShoppingCart()
    {
        cart.add(null);
    }

    public void addToCart(String itemName, double price, int quantity)
    {
        Item item = new Item(price, itemName, quantity);
        cart.add(item);
    }

    public void printCart()
    {
        System.out.println("Cart Size: " + cart.size());

        System.out.println("Items from first in last out.");

        for (int i = 0; i < cart.size(); i++)
        {
            System.out.println(cart.get(i).getItemName());
        }
    }

    public void stackToQueue()
    {
        for (int i = 0; i < cart.size(); i++) {
            try {
                checkoutLane.add(cart.pop());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void printCheckout()
    {
        System.out.println("Amount of items: " + checkoutLane.size() + "\n");

        System.out.println("Items from the top of the cart to the bottom:");

        for (int i = 0; i < checkoutLane.size() + 1; i++)
        {
            System.out.println(checkoutLane.poll().getItemName());
        }
    }
}
