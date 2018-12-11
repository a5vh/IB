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
        JFrame frame = new JFrame();
        DefaultTableModel model = new DefaultTableModel(0, 3);
        JTable table = new JTable(model);

        JTableHeader th = table.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();

        TableColumn tc0 = tcm.getColumn(0);
        TableColumn tc1 = tcm.getColumn(1);
        TableColumn tc2 = tcm.getColumn(2);

        tc0.setHeaderValue("Name of Item");
        tc1.setHeaderValue("Price");
        tc2.setHeaderValue("Size");

        JButton button = new JButton("Click here");


        Queue<Item> checkoutLine = new LinkedList<>();
        Stack shoppingCart = new Stack();

        Scanner scan = new Scanner(System.in);
        String cont = "y";
        double total = 0.00;

        ShoppingCart cart = new ShoppingCart(shoppingCart);
        CheckoutLine checkout = new CheckoutLine(checkoutLine, shoppingCart);
        NumberFormat formatter = new DecimalFormat("$#0.00");

        System.out.println(shoppingCart.size());

        cart.addToCart("Peaches", 2, "small");
        cart.addToCart("Pears", 3, "small");
        cart.addToCart("Dogfood", 21, "large");
        cart.addToCart("Milk", 6, "medium");

        String[] jlist = new String[shoppingCart.size()];
        for (int i = 0; i < shoppingCart.size(); i++)
        {
            jlist[i] = shoppingCart.get(i).;
        }

        JList list = new JList(jlist);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(-1);


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

        frame.add(new JScrollPane(table));
        frame.add(new JScrollPane(list));

        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        String name = JOptionPane.showInputDialog(frame, "What's the name of the item?");
        String price = JOptionPane.showInputDialog(frame, "What's the price of " + name + "?");
        String size = JOptionPane.showInputDialog(frame, "What is the size of " + name + "?");



    }


}
