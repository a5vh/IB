package Queues;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Store {

    JFrame cart;
    JFrame checkout;
    JFrame bags;

    JList

    public Store()
    {
        cart = new JFrame("Cart");
        checkout = new JFrame("Checkout Line");
        bags = new JFrame("Bags");
    }

    public static void main (String[] args)
    {
        Stack<Item> itemStack = new Stack();
        Queue<Item> itemQueue = new LinkedList<Item>();

        ArrayList<String> bigBags = new ArrayList<>();
        ArrayList<String> medBags = new ArrayList<>();
        ArrayList<String> smaBags = new ArrayList<>();

        Store store = new Store();


    }
}
