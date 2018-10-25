package Stacks;
import java.util.*;

public class CargoShip {

    public static void main (String [] args) {

        String cont = "no";
        int integer = 0;
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (cont.equalsIgnoreCase("yes") || (cont.equalsIgnoreCase("y"))) {

            System.out.println("Enter an int to load.");
            integer = scan.nextInt();

            stack.push(integer);

            System.out.println("\nEnter another int?");
            cont = scan.nextLine();

        }

        stack

        ArrayList<Integer> cargoShip = new ArrayList<>(stack);
        int numberAway = 0;

        for (int i = 0; i < cargoShip.size(); i++)
        {
            numberAway = cargoShip.get(i).compareTo(i + 1);

            if (numberAway < 0.0)
            {
                cargoShip.set(i, i-numberAway);
            }
        }

    }
}