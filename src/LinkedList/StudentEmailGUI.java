package LinkedList;
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class StudentEmailGUI extends JFrame {


    JTextArea studentTextArea = new JTextArea();

    JLabel idLabel = new JLabel("ID: ");
    JTextField idTextField = new JTextField(10);
    JLabel nameLabel = new JLabel("Name: ");
    JTextField nameTextField = new JTextField(10);

    JButton addButton = new JButton("Add");
    JButton deleteButton = new JButton("Delete");
    JButton displayAllButton = new JButton("Display All");
    JButton exitButton = new JButton("Exit");

    private LinkedList<StudentEmail> studentLinkedList = new LinkedList<StudentEmail>();

    public StudentEmailGUI()
    {
        JPanel flow1Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow2Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        studentTextArea.setEditable(false);

        JPanel gridPanel = new JPanel(new GridLayout(2, 1));

        flow1Panel.add(idLabel);
        flow1Panel.add(idTextField);
        flow1Panel.add(nameLabel);
        flow1Panel.add(nameTextField);

        flow2Panel.add(addButton);
        flow2Panel.add(deleteButton);
        flow2Panel.add(displayAllButton);
        flow2Panel.add(exitButton);

        gridPanel.add (flow1Panel);
        gridPanel.add (flow2Panel);

        add(studentTextArea, BorderLayout.CENTER);
        add(gridPanel, BorderLayout.SOUTH);

        addButton.addActionListener(event -> addStudent());
        displayAllButton.addActionListener(event -> displayAll());
        exitButton.addActionListener(event -> exitApplication());
    }

    private void addStudent() {
        boolean isIDUnique = true;

        for (StudentEmail stud : studentLinkedList) {
            if (stud.getId().compareToIgnoreCase(idTextField.getText()) == 0) {
                isIDUnique = false;
            }
        }

        if (isIDUnique == false) {
            JOptionPane.showMessageDialog(null, "Error: student ID is already in the database.");
        } else {
            studentLinkedList.add(new StudentEmail(nameTextField.getText(),
                    idTextField.getText()));
            displayAll();
        }
    }

    private void displayAll()
    {
        studentTextArea.setText(" ");

        for (StudentEmail stud : studentLinkedList) {
            studentTextArea.append(stud + "\n");
        }
    }

    private void exitApplication()
    {

    }


    public static void main (String [] args)
    {
        StudentEmailGUI app = new StudentEmailGUI();
        app.setVisible(true);
        app.setSize(500, 500);
        app.setLocation(200, 100);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
