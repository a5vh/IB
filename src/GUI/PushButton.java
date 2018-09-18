package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PushButton extends JApplet {

    private int APPLET_WIDTH = 300, APPLET_HEIGHT = 35;
    private int pushes;
    private JLabel label;
    private JButton push;

    public void init()
    {
        pushes = 0;

        push = new JButton("Push me!");
        push.addActionListener (new ButtonListener());

        label = new JLabel ("Pushes: " + Integer.toString(pushes));

        Container cp = getContentPane();
        cp.setBackground(Color.cyan);
        cp.setLayout(new FlowLayout());
        cp.add(push);
        cp.add(label);

        setSize(APPLET_WIDTH, APPLET_HEIGHT);
    }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            pushes++;
            label.setText("Pushes: " + Integer.toString(pushes));
            repaint();
        }
    }

}
