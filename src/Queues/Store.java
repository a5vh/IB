package Queues;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Store {

    public static void main (String [] args)
    {

        Queue<Item> checkoutLine = new LinkedList<>();
        Stack shoppingCart = new Stack();

        Scanner scan = new Scanner(System.in);
        String cont = "y";
        double total = 0.0;

        ShoppingCart cart = new ShoppingCart(shoppingCart);
        CheckoutLine checkout = new CheckoutLine(checkoutLine, shoppingCart);
        NumberFormat formatter = new DecimalFormat("$#0.00");



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
        cart.addToCart("Dogfood", 20.99, "large");
        cart.addToCart("Milk", 5.99, "medium");

        cart.printCart();

        checkout.stackToQueue(shoppingCart);

        System.out.println("Items transferred to conveyor belt \nfor scanning and bagging.");

        checkout.printCheckout();

        for (int i = 0; i < checkoutLine.size(); i++)
        {
            Item item = checkoutLine.poll();
            total += item.getPrice() + .01;
            checkoutLine.add(item);
        }

        System.out.println("\n" + formatter.format(total));
    }


}
