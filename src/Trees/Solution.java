package Trees;

import java.io.*;


public class Solution {

    public static void bubblesort(int[] array)
    {

    }


    public static void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String [] args) {

        Node head = new Node(1);

        head.insert(3);
        head.insert(4);
        head.insert(2);

        head.printPreOrder();
    }
}

