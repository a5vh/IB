package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;


public class TwoButtons extends JApplet{

    public static void main(String[] args) {

        String numStr;

        Random generator = new Random();
        int num = generator.nextInt(100);

        //String result = ("The random number is " + num);
        numStr = JOptionPane.showInputDialog("Enter a number from 0 to 100.");
        int numGuess = Integer.parseInt(numStr);

        if (numGuess < 100 && numGuess > 50)
        {
            JOptionPane.showMessageDialog(null, "Num is less than 100 but more than 50.");
        }

        if (numGuess < 50 && numGuess > 0)
        {
            JOptionPane.showMessageDialog(null, "Num is less than 50 but more than 0.");
        }
    }
}

