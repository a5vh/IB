package Trees;
import javax.swing.*;
import java.util.*;
import java.awt.*;

public class IntList {

    public static void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your root?");
        int rootNumber = scan.nextInt();

        Node root = new Node(rootNumber);

        JFrame frame = new JFrame("Tree of Ints");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Create");
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }




}
