package Stacks;

public class StackTestLinked
{
    public static void main(String[] args)
    {
        StackADT stack = new LinkedStack();
//push some stuff on the stack
        for (int i=0; i<10; i++)
            stack.push(i*2);
        //pop and print
//should print 18 16 14 12 10 8 6 4 2 0
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
        System.out.println();
    }
}
