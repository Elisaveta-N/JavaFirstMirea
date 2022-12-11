
package task12.shapes;

import javax.swing.*;
import java.awt.*;

class BorderExample extends JFrame {
    //JPanel[] pnl = new JPanel[12];
    Shape[] pnl = new Shape[20];

    public BorderExample() {
        setLayout(new GridLayout(5, 4));
        for (int i = 0; i < pnl.length; i++) {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            //pnl[i] = new JPanel();
            int k = (int)(Math.random()*10%3);
            switch (k){
                case 0:
                    pnl[i] = new RoundRectangle();
                    break;
                case 1:
                    pnl[i] = new Circle();
                    break;
                default:
                    pnl[i] = new Square();
                    break;
            }

            pnl[i].setBackground(new Color(r, g, b));
            add(pnl[i]);
        }

        setSize(800, 500);
    }


}
public class TestShape {
    public static void main(String[] args) {
        BorderExample frame = new BorderExample();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}