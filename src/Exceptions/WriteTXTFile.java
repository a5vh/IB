package Exceptions;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTXTFile {

    public static void main(String[] args)
    {
        PrintWriter writer;
        Scanner scan = new Scanner(System.in);

        try{
            writer = new PrintWriter("src/file.txt", "UTF-8");
            writer.print("Humpty Dumpty sat on a wall,\nHumpty" +
                    "Dumpty had a great fall!\nAll the King's horses and all" +
                    "the King's men,\nCouldn't put Humpty together again!");



            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
