package task12.shapes;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Shape extends JComponent {
    Color col;
    public void generateColor()
    {
        Random rand = new Random();
        col = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    }

    public Shape()
    {
        generateColor();
    }

}
