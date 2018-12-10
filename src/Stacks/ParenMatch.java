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
                s.push(letters[i]);
            }

            if (letters[i].equalsIgnoreCase(")"))
            {
                s.push(letters[i]);
            }
        }

        for (int i = 0; i < s.size(); i++)
        {
            System.out.print(s.get(i));
        }

        if (s.size() == 2)
        {
            System.out.println("\nParentheses match.");
        }

        else System.out.println("\nParentheses don't match or dont exist.");



// print the results
    }
}