package GUI;

import java.awt.*;

/**
 * Created by 19augusthummert on 8/22/2018.
 */
public class Trees {

    private int baseX;
    private int baseY;
    private Color color;
    private int height;

    public Trees (int base, int bottom, Color shade, int size)
    {
        baseX = base;
        baseY = bottom;
        color = shade;
        height = size;
    }

    public void draw (Graphics page)
    {
        int top = baseY - height;

        page.setColor(color);

        Color brown = new Color(102, 51, 0);
        page.setColor(brown);
        page.fillRect(baseX, top+20, 10, baseY);
    }
}
