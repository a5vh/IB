package Stacks;

import java.util.*;
// ****************************************************************
// StackTest.java
//
// A simple driver to test a stack.
//
// ****************************************************************
public class StackTest {

    public void printStack(Stack s)
    {
        for (int i = 0; i < s.size(); i++)
        {
            System.out.println(s.pop());
        }
    }

    public Stack reverseStack(Stack s)
    {
        Stack reversed = new Stack();

        for (int i = 0; i < s.size(); i++)
        {
            reversed.push(s.pop());
        }

        return reversed;
    }

    public Stack removeElement(Stack s, int val)
    {
        s.remove(val);
        return s;
    }

    public static void main(String[] args) {
        StackTest test = new StackTest();
        // Declare and instantiate a stack
        Stack stack = new Stack();

        //push some stuff on the stack
        for (int i = 0; i < 10; i++)
            stack.push(i);

        stack.push(5);

        // call printStack to print the stack
        test.printStack(stack);
        // call reverseStack to reverse the stack
        test.reverseStack(stack);
        // call printStack to print the stack again
        test.printStack(stack);
        // call removeElement to remove all occurrences of the value 5 – save the
        // stack returned from this call
        //test.removeElement(stack, )

        // call printStack to print the original stack and the new stack.

    }



}