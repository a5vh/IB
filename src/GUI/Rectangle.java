package GUI;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by 19augusthummert on 8/21/2018.
 */
public class Rectangle extends Applet {
    public void paint (Graphics page) {

        page.drawLine(50, 80, 450, 80);
        page.drawLine(50, 250, 450, 250);
        page.drawLine(50, 80, 50, 250);
        page.drawLine(450, 80, 450, 250);

        page.drawRect(90, 300, 100, 100);
        page.fillRect(90, 300, 100, 100);

        setSize(500, 500);

    }


}
