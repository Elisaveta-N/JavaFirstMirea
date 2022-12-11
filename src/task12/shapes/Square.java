package task12.shapes;

import java.awt.*;

public class Square extends Shape {


    public void paintComponent(Graphics g)
    {
        int w = this.getWidth();
        int h = this.getHeight();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(col);
        g2d.drawRect(10, 10, w-20, h-20);
    }
}
