package task5_2.DrawShapes;

import javax.swing.*;
import java.awt.*;

public class TestMyPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        MyPanel panel = new MyPanel();
        panel.setPreferredSize(new Dimension(350, 280));

        frame.add(panel);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
