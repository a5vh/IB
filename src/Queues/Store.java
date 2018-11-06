package Queues;

import java.util.*;

public class Store {

    public static void main (String [] args)
    {
        ShoppingCart cart = new ShoppingCart();
        Scanner scan = new Scanner(System.in);
        String cont = "y";

        while (cont.equalsIgnoreCase("y"))
        {
            System.out.println("Enter the item name from the cart.");
            String itemName = scan.next();

            System.out.println("Enter the price of " + itemName);
            double price = scan.nextDouble();

            System.out.println("Enter the quantity of " + itemName);
            int quantity = scan.nextInt();

            cart.addToCart(itemName, price, quantity);

            System.out.println("Any more items? (y/n)");
            cont = scan.next();
        }

        cart.printCart();
    }


}
