package Exceptions;


import LinkedList.Num;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class CSVProgram {



    public static void main(String[] args) {

        File file = new File("src/Files/Students.csv");

        BufferedReader br = null;
        Scanner scan = new Scanner(System.in);

        String nextLine = " ";
        String cvsSplitBy = ",";
        String cont = "y";
        String name = " ";
        int gradeinClass = 0;
        int grade = 0;
        String assignments = " ";
        String line = " ";

        try {
            br = new BufferedReader(new FileReader(file));
            while ((nextLine = br.readLine()) != null) {

                List<String> list = new ArrayList<String>(Arrays.asList(nextLine.split(",")));

                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        while (cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("yes"))

        {
            System.out.println("Enter the name of the student.");
            name = scan.next();

            System.out.println("Enter " + name + "'s grade in the current class.");


            try {
                line = scan.next();
                gradeinClass = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Enter a number please.");
            }

            System.out.println("Enter " + name + "'s grade.");

            try {
                String gradeLine = scan.next();
                grade = Integer.parseInt(gradeLine);
            } catch (NumberFormatException e) {
                System.out.println("Enter a number please.");
            }

            System.out.println("Does " + name + " have all their assignmnets done?");
            assignments = scan.next();

            System.out.println("Any more objects?");
            cont = scan.next();

            try {
                FileWriter fr = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fr);
                PrintWriter out = new PrintWriter(bw);

                out.println("\n" + name + "," + gradeinClass + "," + grade + "," + assignments);
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}




