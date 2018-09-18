package LinkedList;

import java.util.LinkedList;

public class ObjList extends LinkedList<Object> {

    public static void main (String[] args) {

        ObjList list = new ObjList();

        String s1 = new String("dog");
        String s2 = new String("cat");
        Double d2 = new Double(2.2);

        int[] temps = {12, 11, 13, 15, 21, 31};


        list.add(s1);
        list.add(s2);
        list.add(d2);
        list.add(temps);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }
}
