package Stacks;
import java.util.*;

public class CargoShip implements Comparable<Dog> {

    public int compareTo(Dog that) {

    }

    public static void main (String [] args) {

        String cont = "yes";
        String breed = " ";
        String name = " ";
        Scanner scan = new Scanner(System.in);
        Stack<Dog> stack = new Stack<>();

        while (cont.equalsIgnoreCase("yes") || (cont.equalsIgnoreCase("y"))) {

            System.out.println("Enter the breed of the current dog.");
            breed = scan.nextLine();
            System.out.println("\nEnter the name of the " + breed);
            name = scan.nextLine();

            Dog dog = new Dog(breed, name);
            stack.push(dog);

            System.out.println("\nEnter another dog?");
            cont = scan.nextLine();

        }

        ArrayList<Dog> dogs = new ArrayList<>(stack);



        for (Dog dog : dogs)
        {
            System.out.println(dog.getName());
        }

    }
}


/**
 public class Employee implements Comparable<Employee> {
 ...
 public int compareTo(Employee that) {
 return this.id.compareTo(that.id);
 }
 }

 Collections.sort(employees);

 **/