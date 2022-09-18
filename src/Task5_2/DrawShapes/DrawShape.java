package Task5_2.DrawShapes;

import javax.swing.*;
import java.awt.*;

public class DrawShape {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(50, 50);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(350, 280));

        Rectangle rec1 = new Rectangle();
        rec1.setPosition(new Point(0, 0), new Point(70, 70));
        panel.add(rec1);
        JButton button1 = new JButton("AC Milan");
        panel.add(button1);
        JButton button2 = new JButton("AC Milan");
        panel.add(button2);
        JButton button3 = new JButton("AC Milan");
        panel.add(button3);

        frame.add(panel);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
