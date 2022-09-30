package task5_2.DrawShapes;

import java.awt.*;
import java.util.Random;

public abstract class ShapeBase extends Component {
    Color col;
    public void generateColor()
    {
        Random rand = new Random();
        col = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    }
    public  abstract void setPosition(Point topleft, Point bottomRight);
}
