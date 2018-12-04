package Trees;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.*;
import java.awt.*;

public class IntList extends JFrame {

    JPanel flow1panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel flow2panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

    JPanel gridPanel = new JPanel(new GridLayout(2, 1));

    JTextField rootText = new JTextField(8);
    JLabel rootLabel = new JLabel("Root Number");

    Node root;

    public IntList()
    {
        init();
        String root = rootText.getText();
        int rootNum = Integer.parseInt(root);
    }

    public static void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        IntList intObj = new IntList();



        intObj.setTitle("List of Integers");
        intObj.setSize(700, 400);
        intObj.setVisible(true);
    }

    public void init()
    {

    }

    public void add(Node obj)
    {
        String newNumber = JOptionPane.showInputDialog("Enter the next number in\nthe tree.");
        int number = Integer.parseInt(newNumber);

        obj.insert(number);
    }

    public void setRoot(Node obj)
    {
        rootText.getText();

    }


}
