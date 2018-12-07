package Stacks;

import java.util.*;
import java.util.Scanner;
public class ParenMatch
{
    public static void main (String[] args)
    {
        Stack s = new Stack();
        String line; // the string of characters to be checked
        Scanner scan = new Scanner(System.in);
        System.out.println ("\nParenthesis Matching");
        System.out.print ("Enter a parenthesized expression: ");
        line = scan.nextLine();
// loop to process the line one character at a time

        String[] letters = line.split("");

        for (int i = 0; i < letters.length; i++)
        {
            if (letters[i].equalsIgnoreCase("("))
            {
                s.push(i);
            }

            if (letters[i].equalsIgnoreCase(")"))
            {
                s.push(i);
            }
        }

        for (int i = 0; i < 2; i++)
        {
            System.out.print(s.get(i));
        }



// print the results
    }
}