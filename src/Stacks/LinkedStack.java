package Stacks;

import java.util.LinkedList;
import java.util.List;

public class LinkedStack implements StackADT {
    private Node top;

    LinkedList<Object> list = new LinkedList<>();

    // --------------------------------------------------
// Constructor -- initializes top
// --------------------------------------------------
    public LinkedStack() {
        top = new Node();
        list.add(top);
    }

    // --------------------------------------------------
// Adds element to top of stack if it’s not full, else
// does nothing.
// --------------------------------------------------
    public void push(Object val) {

        if (isFull())
        {
            list.add(val);
        }
        else
        {

        }
    }

    // --------------------------------------------------
// Removes and returns value at top of stack. If stack
// is empty returns null.
// --------------------------------------------------
    public Object pop() {

        if (isEmpty())
            return null;
        else
            return list.removeLast();
    }

    // --------------------------------------------------
// Returns true if stack is empty, false otherwise.
// --------------------------------------------------
    public boolean isEmpty() {

        if (list.isEmpty())
            return true;
        else
            return false;

    }

    // --------------------------------------------------
// Returns true if stack is full, false otherwise.
// --------------------------------------------------
    public boolean isFull() {

        if (!list.isEmpty())
            return true;
        else
            return false;

    }
}
