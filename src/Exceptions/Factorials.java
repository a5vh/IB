package Exceptions;

import java.util.Scanner;
public class Factorials
{
    public static void main(String[] args)
    {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y"))
        {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            try {
                if (Math.signum(val) == -1.0)
                {
                }

            System.out.println("Factorial(" + val + ") = "
                    + MathUtils.factorial(val));
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}