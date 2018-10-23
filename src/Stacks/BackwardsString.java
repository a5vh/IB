package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BackwardsString {

    public static void main(String [] args) {

         Scanner scan = new Scanner(System.in);
         Stack<String> wordStack = new Stack<>();

         System.out.println("Enter a word");
         String line  = scan.nextLine();

         String[] wordsArray = line.split("");

         for (String word : wordsArray)
         {
             wordStack.push(word);
         }

         while (wordStack.empty() == false)
         {
             System.out.print(wordStack.pop());
         }
    }
}
