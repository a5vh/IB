package Exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CSVReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/SISData.csv"));
        String line;

        Scanner scan = new Scanner(System.in);

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            for (String str : values) {
                System.out.println(str);
            }
        }
        br.close();

        System.out.println("Enter the student's full name, grade and graduating class.");
        String name = scan.next();
        String grade = scan.next();
        String grad = scan.next();

        FileWriter fr = new FileWriter("src/SISData.csv");

        String noSpaceName = name.replaceAll("//s+" , "");

        fr.write(name + "," + grade + "," + grad + noSpaceName);
    }
}

