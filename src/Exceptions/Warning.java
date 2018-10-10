package Exceptions;

import java.util.Scanner;
import java.io.*;
public class Warning
{
    // --------------------------------------------------------------------
// Reads student data (name, semester hours, quality points) from a
// text file, computes the GPA, then writes data to another file
// if the student is placed on academic warning.
// --------------------------------------------------------------------
    public static void main (String[] args)
    {
        int creditHrs; // number of semester hours earned
        double qualityPts; // number of quality points earned
        double gpa; // grade point (quality point) average
        String line, name, inputName = "students.dat";
        String outputName = "warning.dat";
        try
        {
// Set up scanner to input file
            Scanner scan = new Scanner(inputName);
// Set up the output file stream
            FileOutputStream fileoutput = new FileOutputStream(outputName);
            FileWriter fw = new FileWriter(outputName);
// Print a header to the output file
            fw.write("\n");
            fw.write("Students on Academic Warning");
            fw.write("\n");
// Process the input file, one token at a time
            while (scan.hasNextLine())
            {
                line = scan.nextLine();
                creditHrs = scan.nextInt();
                qualityPts = scan.nextDouble();
// Get the credit hours and quality points and
// determine if the student is on warning. If so,
// write the student data to the output file.
                gpa = creditHrs/qualityPts;
                if (gpa < 1.5 && creditHrs < 30)
                {
                    fw.write(line + " " + creditHrs + " " + gpa);
                }

                if (gpa < 1.75 && creditHrs < 60)
                {
                    fw.write(line + " " + creditHrs + " " + gpa);
                }

                if (gpa < 2.0 && creditHrs > 60)
                {
                    fw.write(line + " " + creditHrs + " " + gpa);
                }

                fw.close();
            }
// Close output file
        }
        catch (FileNotFoundException exception)
        {
            System.out.println ("The file " + inputName + " was not found.");
        }
        catch (IOException exception)
        {
            System.out.println (exception);
        }
        catch (NumberFormatException e)
        {
            System.out.println ("Format error in input file: " + e);
        }
    }
}