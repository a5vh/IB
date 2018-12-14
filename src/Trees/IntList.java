package Trees;
import javax.swing.*;
import javax.swing.border.Border;
import java.lang.reflect.Array;
import java.util.*;
import java.awt.*;

public class IntList {

    JFrame frame;

    IntList()
    {
        frame = new JFrame("Int List");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(250, 150);
        frame.setVisible(true);
    }

    public static void main (String[] args) {
        NodeInt head = new NodeInt("3");
        ArrayList<String> arrayList = new ArrayList<>();

        IntList intList = new IntList();

        String stringTimes = JOptionPane.showInputDialog("How many integers would you likes\n to enter?");
        int intTimes = Integer.parseInt(stringTimes);

        for (int i = 0; i == intTimes; i++)
        {
            String integer = JOptionPane.showInputDialog("What is your integer?");
            int number = Integer.parseInt(integer);

        }

        head.printInOrder(arrayList);

        DefaultListModel dm = new DefaultListModel();
        for (String i : arrayList)
        {
            dm.addElement(i);
        }

        JList list = new JList();
        list.setModel(dm);
        intList.frame.add(list);
        list.updateUI();

        for(int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }


    }

}
