package GUI;

import javax.swing.*;

public class EPIC {

    private JTextField result;
    private JButton allClearButton;
    private JButton plusMinusButton;
    private JButton numberSeven;
    private JButton numberEight;
    private JButton percentButton;
    private JButton divideButton;
    private JButton numberNine;
    private JButton multiButton;
    private JButton numberFour;
    private JButton numberFive;
    private JButton numberSix;
    private JButton minusButton;
    private JButton numberOne;
    private JButton numberThree;
    private JButton plusButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EPIC");
        frame.setContentPane(new EPIC().epic);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton numberZero;
    private JButton numberTwo;
    private JButton commaButton;
    private JButton equalsButton;
    private JPanel epic;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
