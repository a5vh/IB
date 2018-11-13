package Queues;

import java.util.*;

public class Store {

    public static void main (String [] args)
    {

        Queue<Item> checkoutLine = new LinkedList<>();
        Stack shoppingCart = new Stack();

        Scanner scan = new Scanner(System.in);
        String cont = "y";

        ShoppingCart cart = new ShoppingCart(shoppingCart);
        CheckoutLine checkout = new CheckoutLine(checkoutLine, shoppingCart);


/**
        while (cont.equalsIgnoreCase("y"))
        {
            System.out.println("Enter the item name from the shelf.");
            String itemName = scan.next();

            System.out.println("Enter the price of " + itemName);
            double price = scan.nextDouble();

            System.out.println("Is the item small, medium or large?");
            String size = scan.next();

            cart.addToCart(itemName, price, size);

            System.out.println("Any more items? (y/n)");
            cont = scan.next();

            cart.printCart();
        }
**/
        System.out.println(shoppingCart.size());

        cart.addToCart("Peaches", 1.99, "small");
        cart.addToCart("Pears", 2.99, "small");
        cart.addToCart("Dog Food", 20.99, "large");
        cart.addToCart("Milk", 5.99, "medium");

        System.out.println(shoppingCart.size());

        checkout.stackToQueue(shoppingCart);

        System.out.println(shoppingCart.size());

        System.out.println("Items transferred to conveyor belt \nfor scanning and bagging.");
        checkout.printCheckout();

    }


}
