package Stacks;

import java.util.Stack;

public class StackTestArray
{
    public static void main(String[] args)
    {
        StackADT stack = new ArrayStack();
//push some stuff on the stack
        for (int i=0; i<6; i++)
            stack.push(i*2);

        for (int i = 0; i < ((ArrayStack) stack).getSize(); i++)
        {
            System.out.println(i);
        }
    }
}