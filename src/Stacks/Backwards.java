package Stacks;
import java.util.*;

public class Backwards {

    public static void main(String [] args) {

         Scanner scan = new Scanner(System.in);
         Stack<String> wordStack = new Stack<>();

         System.out.println("Enter a line of text");
         String line  = scan.nextLine();

         String[] wordsArray = line.split(" ");

         for (String word : wordsArray)
         {
             wordStack.push(word);
         }

         while (wordStack.empty() == false)
         {
             System.out.print(wordStack.pop() + " ");
         }
    }
}
