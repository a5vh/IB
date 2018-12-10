package Queues;

import javafx.scene.control.Tab;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
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
        {)
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

        for (int i = 0; i < checkoutLine.size(); i++)
        {
            Item item = checkoutLine.poll();
            System.out.println(item.getItemName());
            checkoutLine.add(item);
        }

        System.out.println("\n");

        checkout.bagItems();

        System.out.println("\n" + formatter.format(total));

        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        DefaultTableModel model = new DefaultTableModel(0, 3);
        JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);

        panel.add(table);

        JTableHeader th = table.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();

        TableColumn tc0 = tcm.getColumn(0);
        TableColumn tc1 = tcm.getColumn(1);
        TableColumn tc2 = tcm.getColumn(2);

        tc0.setHeaderValue("Name of Item");
        tc1.setHeaderValue("Price");
        tc2.setHeaderValue("Size");

        




    }


}
