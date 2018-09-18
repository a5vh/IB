package GUI;

import javax.swing.*;

public class DialogBox {

    public static void main(String[] args)
    {
        String numStr, result;
        int num, again;

        JFrame frame = new JFrame("Java is Fun");

        frame.pack();

        do
        {
            numStr = JOptionPane.showInputDialog("Enter an integer: ");

            num = Integer.parseInt(numStr);

            result = "That number is " + ((num%2 == 0) ? "even" : "odd");

            JOptionPane.showMessageDialog(frame, result);

            again = JOptionPane.showConfirmDialog(frame, "Do another?");
        }
        while (again == JOptionPane.YES_OPTION);
    }

}

