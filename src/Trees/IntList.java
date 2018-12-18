package Trees;
import javax.swing.*;
import javax.swing.border.Border;
import java.lang.reflect.Array;
import java.util.*;
import java.awt.*;

public class IntList {

    JFrame frame;
    DefaultListModel dm;

    IntList()
    {
        frame = new JFrame("Int List");
        dm = new DefaultListModel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }


    public static void main (String[] args) {

        String root = JOptionPane.showInputDialog("What is your root number?");
        NodeInt head = new NodeInt(root);
        ArrayList<String> arrayList = new ArrayList<>();

        IntList intList = new IntList();


        int intTimes = Integer.parseInt(JOptionPane.showInputDialog("How many integers would you like\n to enter?"));

        for (int i = 0; i < intTimes; i++) {
            String integer = JOptionPane.showInputDialog("What is your integer?");
            head.insert(integer);
        }


        head.printInOrder(arrayList);
        System.out.println(head.contains("5"));


        for (String i : arrayList)
        {
            intList.dm.addElement(i);
        }

        JList list = new JList();
        JPanel panel = new JPanel();

        GridLayout gridLayout = new GridLayout(1, 1);

        panel.setLayout(gridLayout);

        list.setModel(intList.dm);

        panel.add(list);

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
