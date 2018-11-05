package Queues;

import java.util.*;

public class ShoppingCart {

    public double totalPrice;

    public int largeBag;
    public int mediumBag;
    public int smallBag;

    Stack cart = new Stack();
    Queue<String> checkoutLane = new LinkedList<>();

    Scanner scan = new Scanner(System.in);

    public ShoppingCart()
    {
        totalPrice = 0.0;
    }

    public void addToCart(String itemName, double price, int quantity)
    {
        itemName = scan.next();
        price = scan.nextDouble();
    }
}
