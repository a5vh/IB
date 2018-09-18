package GUI;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;


        /**
 * Created by 19augusthummert on 8/22/2018.
 */
public class ForestOfTrees extends Applet {

        private final int APPLET_WIDTH = 350;
        private final int APPLET_HEIGHT = 250;
        private final int HEIGHT_MIN = 100;
        private final int VARIANCE = 40;

        Random generator = new Random();

        private Trees tree1, tree2, tree3, tree4;


        public void init()
        {
        Color brown = new Color(102, 51, 0);
        tree1 = new Trees(50, 250, brown, 150);
        tree2 = new Trees(125, 250, brown, 100);
        tree3 = new Trees(225, 250, brown, 50);
        tree4 = new Trees(275, 250, brown, 175);

        setBackground(Color.WHITE);
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
        }

        public void paint (Graphics page)
        {
                tree1.draw(page);
                tree2.draw(page);
                tree3.draw(page);
                tree4.draw(page);

                Color green = new Color(0,102,0);
                page.setColor(green);
                page.fillOval(30, 100, 50, 50);
                page.fillOval(105, 150, 50, 50);
                page.fillOval(205, 175, 50, 50);
                page.fillOval(255, 75, 50, 50);

        }
}
