package LinkedList;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.LinkedList;
import java.io.*;
import java.util.Scanner;

//JTable implement

//
public class WebsiteGUI extends JFrame {

    public class Website {

        public static final String WEB = ".com";
        private String siteName;
        private String userName;
        private String password;
        Node head;

        public Website()
        {
            siteName = " ";
            userName = " ";
            password = " ";
        }

        public Website(String site, String user,
                       String pass) {
            this.siteName = site;
            this.userName = user;
            this.password = pass;
        }

        public String getSiteName()
        {
            return siteName;
        }

        public String getUserName()
        {
            return userName;
        }

        public String getPassword()
        {
            return password;
        }

        public void setSiteName(String siteName)
        {
            this.siteName = siteName;
        }

        public void setUserName(String userName)
        {
            this.userName = userName;
        }

        public void setPassword(String password)
        {
            this.password = password;
        }


        public String toString()
        {
            return " " + siteName + "\t\t" + userName + "\t\t" + password;
        }


    }

    JTextArea websiteTextArea = new JTextArea();

    JLabel siteLabel = new JLabel("Website Name: ");
    JTextField siteName = new JTextField(9);
    JLabel userLabel = new JLabel("Username: ");
    JTextField username = new JTextField(9);
    JLabel passwordLabel = new JLabel("Password: ");
    JTextField password = new JTextField(9);

    JButton addButton = new JButton("Add");
    JButton deleteButton = new JButton("Delete");
    JButton getButton = new JButton("Get Credentials");
    JButton displayAllButton = new JButton("Refresh Table");
    JButton exitButton = new JButton("Exit");
    JButton printButton = new JButton("Print To .txt");
    JButton readFileButton = new JButton("Read File");
    JButton genPasswordButton = new JButton("Generate Password");


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

        JPanel gridPanel = new JPanel(new GridLayout(2, 1));

        JScrollPane scroll = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        flow1panel.add(siteLabel);
        flow1panel.add(siteName);
        flow1panel.add(userLabel);
        flow1panel.add(username);
        flow1panel.add(passwordLabel);
        flow1panel.add(password);
        flow1panel.add(addButton);

        flow2panel.add(deleteButton);
        flow2panel.add(getButton);
        flow2panel.add(exitButton);

        flow2panel.add(printButton);
        flow2panel.add(readFileButton);
        flow2panel.add(genPasswordButton);

        addButton.addActionListener(event -> addWebsite());
        deleteButton.addActionListener(event -> deleteWebsite());
        exitButton.addActionListener(event -> exitApplication());
        getButton.addActionListener(event -> get());
        printButton.addActionListener(event -> print());
        displayAllButton.addActionListener(event -> displayAll());
        readFileButton.addActionListener(event -> readFile());
        genPasswordButton.addActionListener(event -> generatePassword());

        JTableHeader th = table.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();

        TableColumn tc0 = tcm.getColumn(0);
        TableColumn tc1 = tcm.getColumn(1);
        TableColumn tc2 = tcm.getColumn(2);

        tc0.setHeaderValue("Sitename");
        tc1.setHeaderValue("Username");
        tc2.setHeaderValue("Password");

        setVisible(true);

        gridPanel.add(flow1panel, BorderLayout.CENTER);
        gridPanel.add(flow2panel, BorderLayout.CENTER);

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



    public void addWebsite() {

        if (isWebsiteInList(siteName.getText()) == true) {
            JOptionPane.showMessageDialog(null, "Error: Website is already listed.");
        } else {
            String[] list = new String[3];

            websiteLinkedList.add(new Website(siteName.getText(), username.getText(),
                    password.getText()));
            siteName.setText("");
            username.setText("");
            password.setText("");

            for (Website web : websiteLinkedList) {
                list[0] = web.getSiteName() + ".com";
                list[1] = web.getUserName();
                list[2] = "*********";
            }

            model.addRow(list);

            list = null;

        }

    }

    public void displayAll()
    {
        table.repaint();
    }

    private void exitApplication()
    {
        System.exit(0);

        for (int i = 0; i < websiteLinkedList.size(); i++)
        {
            websiteLinkedList.remove(i);
        }
    }

    public void deleteWebsite() {
        int row = table.getSelectedRow();

        model.removeRow(row);

        System.out.println(row);

        websiteLinkedList.remove(row);

        displayAll();
        siteName.setText("");
        username.setText("");
        password.setText("");
        }


    public void get()
    {
        int row = table.getSelectedRow();

        String site = " ";
        String user = " ";
        String pass = " ";

        for (Website web : websiteLinkedList)
        {
            site = websiteLinkedList.get(row).getSiteName();
            user = websiteLinkedList.get(row).getUserName();
            pass = websiteLinkedList.get(row).getPassword();
        }


       String message = ("Site Name: " + site + "\n" + "Username: " +
               user + "\n" + "Password: " + pass);

       JOptionPane.showMessageDialog(null, message);
    }


    public void print() {
        try {
            PrintWriter out = new PrintWriter(new FileWriter(""));

            int count = 1;
            for (Website web : websiteLinkedList)
            {
                out.println("Set Number: " + count);
                out.println("Site Name: " + web.getSiteName());
                out.println("Username: " + web.getUserName());
                out.println("Password: " + web.getPassword() + "\n\n");
                count++;
            }
            out.close();
        }
        catch (IOException e){

            JOptionPane.showMessageDialog(null, "File Doesn't Exist." + "\n" + e.toString());

        }

    }

    public void readFile() {

        String site = "1 ";
        String user = "2 ";
        String pass = "3 ";
        int count = 0;

        JFileChooser chooser = new JFileChooser();

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();

            try {
                Scanner scan = new Scanner(f);

                do {
                    String line = scan.nextLine();
                    if (line.contains("Site Name: ")) {
                        site = line.substring(10);
                    }

                    if (line.contains("Username: ")) {
                        user = line.substring(9);
                    }

                    if (line.contains("Password: ")) {
                        pass = line.substring(9);
                    }

                    websiteLinkedList.add(new Website(site, user, pass));

                    for (Website web : websiteLinkedList)
                    {
                        System.out.println("Site: " + web.getSiteName());
                        System.out.println("User: " + web.getUserName());
                        System.out.println("Pass: " + web.getPassword());
                    }

                } while((scan.hasNextLine()));

                String[] list = new String[3];

                for (Website web : websiteLinkedList) {
                    list[0] = web.getSiteName();
                    list[1] = web.getUserName();
                    list[2] = web.getPassword();
                }

                model.addRow(list);


            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "File Doesn't Exist." + "\n" + e.toString());
            }

        } else {

        }
    }

    public void generatePassword()
    {
        String site = siteName.getText();
        String user = username.getText();

        String firstNasme = JOptionPane.showInputDialog(null, "What is your first name?");
        String lastName = JOptionPane.showInputDialog(null, "What is your last name?");

        int domainLength = site.length();
        String domain = String.valueOf(domainLength);

        String first = site.substring(0, 1);
        String last = site.substring(site.length() - 1);

        String name = firstNasme + "_" + lastName;

        String fNameString = firstNasme.substring(0, 1);
        String lNameString = lastName.substring(lastName.length() - 1);

        int fNameLength = firstNasme.length();
        int lNameLength = lastName.length();
        int nameLength = name.length();

        String fNameLengthString = String.valueOf(fNameLength);
        String lNameLengthString = String.valueOf(lNameLength);
        String NameLengthString = String.valueOf(nameLength);

        String genPassword = first + last + (String.valueOf(fNameLength + lNameLength)) + lNameString + fNameString +
                fNameLengthString + NameLengthString + lNameLengthString;

        password.setText(genPassword);
    }


    public static void main (String[] args)
    {
        WebsiteGUI website = new WebsiteGUI();
        Dimension dimension = new Dimension();
        dimension.setSize(600, 300);

        website.setTitle("Passkey 1.0");
        website.setSize(700, 400);
        website.setLocation(500, 500);
        website.setVisible(true);
    }
}
