package Queues;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


//item has the parameters for price, itemName, quantity and size
//cart then stores those items in a stack
//checkout then takes those items and puts them in a queue
//bags then bags those items into seperate arraylists
public class Store {

    JFrame cart;
    JFrame checkout;
    JFrame bags;

    JList list = new JList();

    Stack<Item> itemStack;
    Queue<Item> itemQueue;

    ArrayList<Item> bigBags;
    ArrayList<Item> medBags;
    ArrayList<Item> smaBags;

    public Store()
    {
        cart = new JFrame("Cart");
        checkout = new JFrame("Checkout Line");
        bags = new JFrame("Bags");

        itemStack = new Stack();
        itemQueue = new LinkedList<Item>();

        bigBags = new ArrayList<Item>();
        medBags = new ArrayList<>();
        smaBags = new ArrayList<>();

        cart.setVisible(false);
        checkout.setVisible(false);
        bags.setVisible(false);
    }

    public void cartGUI(Stack<Item> items)
    {
        items = this.itemStack;

        cart.setSize(300, 300);

        String name;
        String price;
        String size;

        String cont = "yes";

        while(cont.equalsIgnoreCase("yes"))
        {
            name = JOptionPane.showInputDialog("What are you putting in your cart?");
            price = JOptionPane.showInputDialog("What is the price of " + name);

            String[] sizes = {"Small", "Medium", "Large"};

            Object selected = JOptionPane.showInputDialog(null, "What is the size of " + name, "Selection", JOptionPane.DEFAULT_OPTION, null, sizes, "0");
            size = selected.toString();

            Item item = new Item(price, name, size);
            items.add(item);

            cont = JOptionPane.showInputDialog("Another item?");
        }

        JPanel panel = new JPanel();
        DefaultTableModel dtm = new DefaultTableModel(items.size()-1, 3);
        JTable cartList = new JTable(dtm);

        JTableHeader th = cartList.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();

        TableColumn tc0 = tcm.getColumn(0);
        TableColumn tc1 = tcm.getColumn(1);
        TableColumn tc2 = tcm.getColumn(2);

        tc0.setHeaderValue("Name");
        tc1.setHeaderValue("Size");
        tc2.setHeaderValue("Price");

        for (Item i : items)
        {
            String[] row = {i.getItemName(), i.getSize(), i.getPrice()};
            dtm.addRow(row);
        }

        panel.add(new JScrollPane(cartList));
        cart.add(cartList);
        cart.add(cartList.getTableHeader(), BorderLayout.NORTH);
        cart.setVisible(true);
    }

    public void checkoutGUI(Queue<Item> items)
    {
        items = this.itemQueue;

        checkout.setSize(300, 300);

        DefaultListModel<String> dlm = new DefaultListModel<>();

        for(Item i : items)
        {
            dlm.addElement(i.getItemName());
        }

        JList<String> checkoutLine = new JList<>(dlm);
        checkout.add(checkoutLine);
        checkout.setVisible(true);
    }

    public void bagGUI(ArrayList<Item> big, ArrayList<Item> med, ArrayList<Item> sma)
    {
        big = this.bigBags;
        med = this.medBags;
        sma = this.smaBags;

        for (Item i : itemQueue)
        {
            if (i.getSize().equalsIgnoreCase("Large"))
            {
                big.add(i);
            }

            else if (i.getSize().equalsIgnoreCase("Medium"))
            {
                med.add(i);
            }

            else if (i.getSize().equalsIgnoreCase("Small"))
            {
                sma.add(i);
            }
        }

        JPanel panel = new JPanel();
        DefaultTableModel dtm = new DefaultTableModel(5, 3);
        JTable bagsList = new JTable(dtm);

        JTableHeader th = bagsList.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();

        TableColumn tc0 = tcm.getColumn(0);
        TableColumn tc1 = tcm.getColumn(1);
        TableColumn tc2 = tcm.getColumn(2);

        tc0.setHeaderValue("Big Bags");
        tc1.setHeaderValue("Medium Bags");
        tc2.setHeaderValue("Small Bags");

        String[] large = new String[big.size()];
        String[] medium = new String[med.size()];
        String[] small = new String[sma.size()];

        for (int i = 0; i < big.size(); i++)
        {
            large[i] = big.get(i).getItemName();
        }

        for (int i = 0; i < med.size(); i++)
        {
            medium[i] = med.get(i).getItemName();
        }

        for (int i = 0; i < sma.size(); i++)
        {
            small[i] = sma.get(i).getItemName();
        }

        dtm.addColumn(large);
        dtm.addColumn(medium);
        dtm.addColumn(small);

        panel.add(new JScrollPane(bagsList));
        bags.add(bagsList);
        bags.add(bagsList.getTableHeader(), BorderLayout.NORTH);
        bags.setVisible(true);
        bags.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main (String[] args)
    {
        Store store = new Store();

        store.cartGUI(store.itemStack);

        for(int i = 0; i < store.itemStack.size(); i++)
        {
            Item item = store.itemStack.pop();
            store.itemQueue.add(item);
        }

        WindowListener exitListenerCart = new WindowListener() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmation = JOptionPane.showOptionDialog(store.cart, "Open frame2", "Open frame2",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (confirmation == 0)
                {
                    store.checkoutGUI(store.itemQueue);
                }
            }
            @Override
            public void windowOpened(WindowEvent e) {
            }
            @Override
            public void windowClosed(WindowEvent e) {
            }
            @Override
            public void windowIconified(WindowEvent e) {
            }
            @Override
            public void windowDeiconified(WindowEvent e) {
            }
            @Override
            public void windowActivated(WindowEvent e) {
            }
            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        };

        store.cart.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        store.cart.addWindowListener(exitListenerCart);

        WindowListener exitListenerCheckout = new WindowListener() {

            @Override
            public void windowClosing(WindowEvent e) {
                int confirmation = JOptionPane.showOptionDialog(store.checkout, "Open frame2", "Open frame2",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (confirmation == 0)
                {
                    store.bagGUI(store.bigBags, store.medBags, store.smaBags);
                }
            }
            @Override
            public void windowOpened(WindowEvent e) {
            }
            @Override
            public void windowClosed(WindowEvent e) {
            }
            @Override
            public void windowIconified(WindowEvent e) {
            }
            @Override
            public void windowDeiconified(WindowEvent e) {
            }
            @Override
            public void windowActivated(WindowEvent e) {
            }
            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        };

        store.checkout.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        store.checkout.addWindowListener(exitListenerCheckout);
    }
}
