package GUI; /**
 * Created by 19augusthummert on 8/20/2018.
 */

//draw class

import java.applet.Applet;
        import java.awt.*;

public class Einstein extends Applet {

    public void paint(Graphics page) {
        page.drawRect(50, 50, 40, 40); //square
        page.drawRect(60, 80, 225, 30);  //rectangle
        page.drawRect(75, 65, 20, 20);  //circle
        page.drawLine(35, 60, 100, 120);

        page.drawString("Out of clutter, find simplicity.", 110, 70);
        page.drawString("--Albert Einstein", 130, 100);
    }

}
