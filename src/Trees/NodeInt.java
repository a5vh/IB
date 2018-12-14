package Trees;

import java.util.ArrayList;

public class NodeInt {

    NodeInt left, right;
    String data;

    public NodeInt(String data)
    {
        this.data = data;
    }

    public void insert(String value)
    {
        if (Integer.parseInt(value) <= Integer.parseInt(data)) {
            if (left == null) {
                left = new NodeInt(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new NodeInt(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains (int value)
    {
        if (value == Integer.parseInt(data)) {
            return true;
        } else if (value < Integer.parseInt(data)) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder(ArrayList<String> arrayList)
    {
        if (left != null) {
            left.printInOrder(arrayList);
        }

        arrayList.add(data);

        if (right != null) {
            right.printInOrder(arrayList);
        }
    }

    public void printPreOrder()
    {
        System.out.println(data);

        if (left != null) {
            left.printPreOrder();
        }

        if (right != null) {
            right.printPreOrder();
        }
    }

    public void printPostOrder()
    {
        if (left != null) {
            left.printPostOrder();
        }

        if (right != null) {
            right.printPostOrder();
        }

        System.out.println(data);
    }

}
