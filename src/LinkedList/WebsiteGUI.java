package LinkedList;

import javax.swing.*;
import java.util.LinkedList;

public class WebsiteGUI extends JFrame {

    JTextArea websiteTextArea = new JTextArea();

    JLabel siteLabel = new JLabel("Website Name: ");
    JTextField siteName = new JTextField(7);
    JLabel userLabel = new JLabel("Username: ");
    JTextField username = new JTextField(7);
    JLabel passwordLabel = new JLabel("Password: ");
    JTextField password = new JTextField(7);

    JButton addButton = new JButton("Add");
    JButton deleteButton = new JButton("Delete");
    JButton getButton = new JButton("Get Credentials");

    private LinkedList<Website> websiteLinkedList = new LinkedList<>l;
}
