package Task5_2.DrawShapes;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Rectangle rec;

    MyPanel()
    {
        rec = new Rectangle();
        Rectangle rec1 = new Rectangle();
        rec1.setPosition(new Point(0, 0), new Point(70, 70));
        this.add(rec1);
    }

    public void paint(Graphics g)
    {
        g.drawLine(20, 50, 460, 50);
        rec.paint(g);
    }
}
