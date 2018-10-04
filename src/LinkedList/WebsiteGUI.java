package LinkedList;

import javafx.scene.control.Tab;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.TableView;
import java.awt.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.Vector;

//JTable implement

//
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
    JButton printButton = new JButton("Pirnt To .txt");
    public  Vector<String> dataString = new Vector<>();
    public   DefaultTableModel model = new DefaultTableModel(0, 3);
    JTable table = new JTable(model);

    public LinkedList<Website> websiteLinkedList = new LinkedList<Website>();

    public WebsiteGUI()
    {
        init();
    }

    public void init()
    {
        JPanel flow1panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow2panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow3panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JPanel gridPanel = new JPanel(new GridLayout(3, 1));

        JScrollPane scroll = new JScrollPane(table);
        add(scroll);

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
        flow2panel.add(printButton);

        addButton.addActionListener(event -> addWebsite());
        displayAllButton.addActionListener(event -> displayAll());
        deleteButton.addActionListener(event -> deleteWebsite());
        exitButton.addActionListener(event -> exitApplication());
        getButton.addActionListener(event -> get());
        printButton.addActionListener(event -> print());

        JTableHeader th = table.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();

        TableColumn tc0 = tcm.getColumn(0);
        TableColumn tc1 = tcm.getColumn(1);
        TableColumn tc2 = tcm.getColumn(2);

        tc0.setHeaderValue("Sitename");
        tc1.setHeaderValue("Username");
        tc2.setHeaderValue("Password");


        setVisible(true);


        gridPanel.add(flow1panel);
        gridPanel.add(flow2panel);
        gridPanel.add(flow3panel);


        add(gridPanel, BorderLayout.SOUTH);
        add(table.getTableHeader(), BorderLayout.NORTH);
        add(table, BorderLayout.CENTER);
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
            siteName.setText("");
            username.setText("");
            password.setText("");
            for (Website web : websiteLinkedList) {
               for (int i = 0; i < websiteLinkedList.size(); i++)
               {
                   dataString.add(web.getSiteName());
                   dataString.add(web.getUserName());
                   dataString.add(web.getPassword());
               }
           }
           model.addRow(dataString);

       }
    }

    public void displayAll()
    {

    }

    private void exitApplication()
    {
        System.exit(0);
    }

    public void deleteWebsite() {

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
            siteName.setText("");
            username.setText("");
            password.setText("");
        }
    }

    public void get()
    {
        if (isWebsiteInList(siteName.getText()) == false)
        {
            JOptionPane.showMessageDialog(null, "Error: Website is not in the database.");
        }
        else {
            for (int s = 0; s < websiteLinkedList.size(); s++)
            {
                String currSite = websiteLinkedList.get(s).getSiteName();
                if (currSite.compareToIgnoreCase(siteName.getText()) == 0) {
                    String message = "Website Name: " + websiteLinkedList.get(s).getSiteName() + ".com" + "\n" +
                            "Username: " + websiteLinkedList.get(s).getUserName() + "\n" + "Password: " + websiteLinkedList.get(s).getPassword();
                    JOptionPane.showMessageDialog(null, message);
                }
            }
        }
    }

    public void print() {
        try {
            File file = new File("C:/Users/19augusthummert/Documents/IB/passwords.txt");

            FileWriter fw = new FileWriter(file);
            fw.write("wow");
        }
        catch (IOException e){

            JOptionPane.showMessageDialog(null, "File Doesn't Exist." + "\n" + e.toString());

        }

    }


    public static void main (String[] args)
    {
        WebsiteGUI website = new WebsiteGUI();
        Dimension dimension = new Dimension();
        dimension.setSize(600, 300);

        website.setSize(600, 300);
        website.setVisible(true);
    }
}
