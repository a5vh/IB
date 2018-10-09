package Exceptions;


import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class ReadTXTFile {

    public static void main (String [] args)
    {
        try {
            BufferedReader br = null;
            FileReader fr = new FileReader("src/test.txt");
            String aCurrentLine = "";

            while ((aCurrentLine = br.readLine()) !=  null) {
                System.out.println(aCurrentLine);
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
