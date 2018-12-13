package Trees;
import javax.swing.*;
import javax.swing.border.Border;
import java.lang.reflect.Array;
import java.util.*;
import java.awt.*;

public class IntList {

    JFrame frame;
    static ArrayList<String> arrayList;

    IntList(ArrayList<String> arrayList)
    {
        this.arrayList = arrayList;
        frame = new JFrame("Int List");
        JList list = new JList((ListModel) arrayList);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(list);
        frame.setSize(500, 600);
    }

    public String[] refreshArray(ArrayList<String> list)
    {
       String[] array = new String[list.size()];

       for (int i = 0; i < list.size(); i++)
       {
           array[i] = list.get(i);
       }

       return array;
    }

    public static void main (String[] args)
    {
        NodeInt head = new NodeInt(1);

        IntList intList = new IntList(arrayList);

        head.insert(7);
        head.insert(4);


    }

}
