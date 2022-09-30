package task5_2.DrawShapes;

import java.awt.*;

public class Rectangle extends ShapeBase{
    Point pt1;
    int width;
    int height;
    @Override
    public void setPosition(Point topleft, Point bottomRight) {
        pt1 = new Point(topleft.x + 5, topleft.y+5);
        width = bottomRight.x - topleft.x - 10;
        height = bottomRight.y - topleft.y - 10;
    }
    public void paint(Graphics g)
    {
        g.setColor(col);
        g.drawRect(pt1.x, pt1.y, width, height);
    }
}
