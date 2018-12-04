package Queues;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.Comparator;

public class Store {

    public static void main (String [] args)
    {

        Queue<Item> checkoutLine = new LinkedList<>();
        Stack shoppingCart = new Stack();

        Scanner scan = new Scanner(System.in);
        String cont = "y";
        double total = 0.00;

        ShoppingCart cart = new ShoppingCart(shoppingCart);
        CheckoutLine checkout = new CheckoutLine(checkoutLine, shoppingCart);
        NumberFormat formatter = new DecimalFormat("$#0.00");



/**
        while (cont.equalsIgnoreCase("y"))
        {
            System.out.println("Enter the item name from the shelf.");
            String itemName = scan.nextLine();

            System.out.println("Enter the price of " + itemName + " (round to the nearest # if a decimal.");
            double price = scan.nextDouble();

            System.out.println("Is the item small, medium or large?");
            String size = scan.nextLine();

            cart.addToCart(itemName, price, size);

            System.out.println("Any more items? (y/n)");
            cont = scan.next();

            cart.printCart();
        }
**/
        System.out.println(shoppingCart.size());

        cart.addToCart("Peaches", 2, "small");
        cart.addToCart("Pears", 3, "small");
        cart.addToCart("Dogfood", 21, "large");
        cart.addToCart("Milk", 6, "medium");

        cart.printCart();

        checkout.stackToQueue(shoppingCart);

        System.out.println("Items transferred to conveyor belt \nfor scanning and bagging.");

        ((LinkedList<Item>) checkoutLine).sort(Comparator.comparing(Item::getSize));

        checkout.printCheckout();

        for (int i = 0; i < checkoutLine.size(); i++)
        {
            Item item = checkoutLine.poll();
            double currentPrice = item.getPrice();
            total += currentPrice;
            checkoutLine.add(item);
        }

        checkout.bagItems();

        System.out.println("\n" + formatter.format(total));
    }


}
