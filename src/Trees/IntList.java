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

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main (String[] args) {

        String root = JOptionPane.showInputDialog("What is your root number?");
        NodeInt head = new NodeInt(root);
        ArrayList<String> arrayList = new ArrayList<>();

        IntList intList = new IntList();

        String stringTimes = JOptionPane.showInputDialog("How many integers would you like\n to enter?");
        int intTimes = Integer.parseInt(stringTimes);


        for (int i = 0; i < intTimes; i++) {
            String integer = JOptionPane.showInputDialog("What is your integer?");
            head.insert(integer);
        }

        head.printInOrder(arrayList);
        System.out.println(head.contains("5"));

        DefaultListModel dm = new DefaultListModel();
        for (String i : arrayList)
        {
            dm.addElement(i);
        }

        JList list = new JList();
        JPanel panel = new JPanel();
        JButton add = new JButton("Add");
        add.setSize(5, 5);

        Dimension d = new Dimension(10, 10);
        add.setPreferredSize(d);

        GridLayout gridLayout = new GridLayout(2, 1);

        panel.setLayout(gridLayout);

        list.setModel(dm);

        panel.add(list);
        panel.add(add);

        intList.frame.add(panel);

        list.updateUI();
        intList.frame.pack();
        intList.frame.setSize(300, 300);

        for(int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }


    }

}
