package Queues;

import java.util.*;

public class ShoppingCart {

    Stack<Item> cart = new Stack<>();

    public double totalPrice;

    public ShoppingCart(Stack stack)
    {
        this.cart = stack;
    }

    public ShoppingCart()
    {
    }

    public void addToCart(String itemName, double price, int quantity, String size)
    {
        Item item = new Item(price, itemName, quantity, size);
        cart.add(item);
    }

    public void printCart()
    {
        System.out.println("Cart Size: " + cart.size());

        System.out.println("Items in the cart: ");

        for (int i = cart.size() - 1; i >= 0; i--)
            System.out.println(cart.get(i).getItemName());
    }


}
