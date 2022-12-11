package task12.shapes;

import task12.shapes.Shape;

import java.awt.*;

public class RoundRectangle extends Shape {

    public void paintComponent(Graphics g)
    {
        int w = this.getWidth();
        int h = this.getHeight();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(col);
        g2d.drawRoundRect(10, 10, w-20, h-20, 30, 30);
    }
}
