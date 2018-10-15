package Exceptions;


import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class CSVProgram {

    public static void main (String [] args)
    {
        File file = new File("src/Students.csv");
        BufferedReader br = null;
        Scanner scan = new Scanner(System.in);

        String nextLine = " ";
        String cvsSplitBy = ",";
        String cont = "y";
        String name = " ";
        String gradeinClass = " ";
        String grade = " ";
        String assignments = " ";

        try {

            br = new BufferedReader(new FileReader(file));
            while ((nextLine = br.readLine()) != null) {

                String[] Students = nextLine.split(cvsSplitBy);

                System.out.println("Name: " + Students[0] + "\n" + "Grade in Class: " + Students[1]
                        + "%" + "\n" + "Grade: " + Students[2] + "\n" + "All assignments turned in?: "
                        + Students[3] + "\n");
            }
            br.close();

            } catch (Exception e)
        {
            e.printStackTrace();
        }

        while (cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter the name of the student.");
            name = scan.next();
            System.out.println("Enter " + name + "'s grade in the current class.");
            gradeinClass = scan.next();
            System.out.println("Enter " + name + "'s grade.");
            grade = scan.next();
            System.out.println("Does " + name + " have all their assignmnets done?");
            assignments = scan.next();

            try {
                FileWriter fr = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fr);
                PrintWriter out = new PrintWriter(bw);

                out.println("\n" + name + "," + gradeinClass + "," + grade + "," + assignments);
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Any more objects?");
            cont = scan.next();
        }
    }
}
