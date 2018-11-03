package Stacks;
import java.util.*;


public class CargoShip {

    public static void main (String [] args) {

        String cont = "yes";
        int integer = 0;
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (cont.equalsIgnoreCase("yes") || (cont.equalsIgnoreCase("y"))) {

            System.out.println("\nEnter an int to load.");
            integer = scan.nextInt();

            stack.push(integer);

            System.out.println("Enter another int?");
            cont = scan.next();

        }

        ArrayList<Integer> cargoShip = new ArrayList<>(stack);
        int numberAway = 0;

        Collections.sort(cargoShip);

        for (int i = 0; i < cargoShip.size(); i++)
        {
            System.out.println(cargoShip.get(i));
        }

    }
}