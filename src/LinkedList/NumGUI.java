package LinkedList;
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

//make a gui where it is a pattern or rhythm of numbers
//program auto generates a certain number of numbers that the user wants generated
//https://coderanch.com/t/339129/java/convert-getText-int <- this is how to convert getText to int
//need to develop the pattern algorithm
public class NumGUI extends JFrame {

    JLabel numToStartLabel = new JLabel("Number to Start: ");
    JTextField numToStart = new JTextField(5);
    JLabel patternLabel = new JLabel("Pattern of +: ");
    JTextField pattern = new JTextField(5);

    JButton startPattern = new JButton("Start Pattern");
    JButton exitButton = new JButton("Exit");

    private LinkedList<Num> numLinkedList = new LinkedList<>();

    public NumGUI()
    {
        JPanel flow1Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow2Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JPanel gridPanel = new JPanel(new GridLayout(2, 1));

        flow1Panel.add(numToStartLabel);
        flow1Panel.add(numToStart);
        flow1Panel.add(patternLabel);
        flow1Panel.add(pattern);

        flow2Panel.add(startPattern);
        flow2Panel.add(exitButton);

        gridPanel.add(flow1Panel);
        gridPanel.add(flow2Panel);

        add(gridPanel);
    }

    public void startPattern()
    {
        numLinkedList.add(new Num(numToStart.getTex))
    }

    public static void main(String [] args)
    {
        NumGUI app = new NumGUI();
        app.setVisible(true);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
