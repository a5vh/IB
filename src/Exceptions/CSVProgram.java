package Exceptions;


import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CSVProgram {

    public static void main (String [] args)
    {
        try{
            File file = new File("src/SISData.csv");
            FileReader fr = new FileReader(file);
            CSVReader csv = new CSVReader(fr);

            String[] nextRecord;

            while((nextRecord = csv.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }

                System.out.println();
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
