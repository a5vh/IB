package GUI; /**
 * Created by 19augusthummert on 8/21/2018.
 */
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;


public class BarHeights extends Applet {



    public void paint(Graphics page)
    {
        Scanner scan = new Scanner(System.in);
        final int NUM_BARS = 10, WIDTH = 30, MAX_HEIGHT = 300, GAP = 9;
        int tallX = 0, tallest = 0, shortX = 0, shortest = MAX_HEIGHT;
        int x, height, count = 0;

        x = GAP;

        while (count < NUM_BARS)
        {
            System.out.println("Enter a height.");

            height = scan.nextInt();
            page.fillRect(x, MAX_HEIGHT-height, WIDTH, height);

            x = x + WIDTH + GAP;

            count++;
        }

        page.setColor(Color.red);
        page.fillRect(tallX, MAX_HEIGHT- tallest, WIDTH, tallest);

        page.setColor(Color.yellow);
        page.fillRect(shortX, MAX_HEIGHT- shortest, WIDTH, shortest);

    }

}
