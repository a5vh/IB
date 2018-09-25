package LinkedList;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
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
    JButton displayAllButton = new JButton("DisplayAll");
    JButton exitButton = new JButton("Exit");

    private LinkedList<Website> websiteLinkedList = new LinkedList<Website>();

    public WebsiteGUI()
    {
        JPanel flow1panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel flow2panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        websiteTextArea.setEditable(false);

        JPanel gridPanel = new JPanel(new GridLayout(2, 1));

        flow1panel.add(siteLabel);
        flow1panel.add(siteName);
        flow1panel.add(userLabel);
        flow1panel.add(username);
        flow1panel.add(passwordLabel);
        flow1panel.add(password);

        flow2panel.add(addButton);
        flow2panel.add(deleteButton);
        flow2panel.add(getButton);
        flow2panel.add(displayAllButton);
        flow2panel.add(exitButton);

        gridPanel.add(flow1panel);
        gridPanel.add(flow2panel);

        add(websiteTextArea, BorderLayout.CENTER);
        add(gridPanel, BorderLayout.SOUTH);

        addButton.addActionListener(event -> addWebsite());
        displayAllButton.addActionListener(event -> displayAll());
        deleteButton.addActionListener(event -> delteWebsite());
        exitButton.addActionListener(event -> exitApplication());
    }

    private boolean isWebsiteInList(String siteName) {
        boolean inList = false;

        for (Website stud : websiteLinkedList) {
            if (stud.getSiteName().compareToIgnoreCase(siteName) == 0) {
                inList = true;
            }
        }
        return inList;

    }


    public void addWebsite()
    {
       if (isWebsiteInList(siteName.getText()) == true)
        {
            JOptionPane.showMessageDialog(null, "Error: Website is already listed.");
        } else {
            websiteLinkedList.add(new Website(siteName.getText(), username.getText(),
                    password.getText()));
            siteName.setText(" ");
            username.setText(" ");
            password.setText(" ");

       }
        displayAll();
    }

    private void displayAll()
    {
        websiteTextArea.setText(" ");

        for (Website web : websiteLinkedList) {
            websiteTextArea.append(web + "\n");
        }
    }

    private void exitApplication()
    {
        System.exit(0);
    }

    public void delteWebsite() {

        if (websiteLinkedList.size() == 0) {
            JOptionPane.showMessageDialog(null, "Error: database is empty.");
        }

        if (isWebsiteInList(siteName.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Error: Site name is not in the database.");
        } else {
            for (int s = 0; s < websiteLinkedList.size(); s++)
            {
                String currSite = websiteLinkedList.get(s).getSiteName();
                if (currSite.compareToIgnoreCase(siteName.getText()) == 0) {
                    websiteLinkedList.remove(s);
                }
            }
            displayAll();
            siteName.setText(" ");
            username.setText(" ");
            password.setText(" ");
        }
    }

    //private Website get(int index)
    //{

    //}

    public static void main (String[] args)
    {
        WebsiteGUI app = new WebsiteGUI();
        app.setVisible(true);
        app.setSize(550, 500);
        app.setLocation(200,100);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
