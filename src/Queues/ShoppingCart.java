package Queues;

import java.util.*;

public class ShoppingCart {

    public int largeBag;
    public int mediumBag;
    public int smallBag;

    Stack<Item> cart = new Stack<>();

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
            System.out.println(cart.pop().getItemName());
        }
    }
}
