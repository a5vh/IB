package Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class FileCopying {

    public static void main (String[] args)
    {
        String fileName = " ";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a filename.");

        boolean tryAgain = false;

        String nextLine = " ";


        while (!tryAgain) {
            try {
                fileName = scan.next();
                File file = new File("src/Files/" + fileName + ".txt");
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine())
                {
                    nextLine = scanner.nextLine();
                    System.out.println(nextLine);
                }

                tryAgain = true;

            } catch (FileNotFoundException e) {
                System.out.println("File doesn't exist.\n" + e.toString());
            }

        }

    }

}
