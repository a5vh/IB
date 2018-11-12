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



        while (cont.equalsIgnoreCase("y"))
        {
            System.out.println("Enter the item name from the cart.");
            String itemName = scan.next();

            System.out.println("Enter the price of " + itemName);
            double price = scan.nextDouble();

            System.out.println("Enter the quantity of " + itemName);
            int quantity = scan.nextInt();

            System.out.println("Is the item small, medium or large?");
            String size = scan.next();

            cart.addToCart(itemName, price, quantity, size);

            System.out.println("Any more items? (y/n)");
            cont = scan.next();

            cart.printCart();
        }

        checkout.stackToQueue(shoppingCart);
        checkout.printCheckout();

    }


}
