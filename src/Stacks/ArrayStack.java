package Stacks;

import java.util.*;

public class ArrayStack implements StackADT
{
    private int stackSize = 5; // capacity of stack
    private int top; // index of slot for next element
    private Object[] elements;
    // --------------------------------------------------
// Constructor -- initializes top and creates array
// --------------------------------------------------
    public ArrayStack()
    {
        elements = new Object[stackSize];
        top = 0;
    }
    // --------------------------------------------------
// Adds element to top of stack if it’s not full, else
// does nothing.
// --------------------------------------------------
    public void push(Object val)
    {
        if (isFull() == false)
        {
            top++;
            elements[top] = val;
        }
        else
        {

        }
    }
    // --------------------------------------------------
// Removes and returns value at top of stack. If stack
// is empty returns null.
// --------------------------------------------------
    public Object pop()
    {
        if (isEmpty())
            return null;
        else
        {
            top--;
            return elements[top];
        }
    }
    // --------------------------------------------------
// Returns true if stack is empty, false otherwise.
// --------------------------------------------------
    public boolean isEmpty()
    {
        if (top == 0)
            return true;
        else
            return false;
    }
    // --------------------------------------------------
// Returns true if stack is full, false otherwise.
// --------------------------------------------------
    public boolean isFull()
    {
        if (elements[stackSize-1] != null)
            return true;
        else
            return false;
    }

    public void printStack(Stack s)
    {

    }

    public Stack reverseStack(Stack s)
    {
        return s;
    }

    public Stack removeElement(Stack s, int val)
    {
        return s;
    }


}