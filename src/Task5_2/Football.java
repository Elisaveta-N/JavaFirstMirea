package Task5_2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Football {
    static int mil = 0, mad = 0;
    public static void main(String[] args) {


        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
//создали панель
        JPanel panel = new JPanel();
//задали свойство панели – цвет фона
        panel.setBackground(Color.PINK);
// задали свойство панели размеры
        panel.setPreferredSize(new Dimension(200, 300));
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        panel.add(button1);
        panel.add(button2);



        JLabel label = new JLabel("Result: " + mil +"x" + mad);
        JLabel label2 = new JLabel("Last scorer: N/A");
        JLabel label3 = new JLabel("Winner: DRAW");
        panel.add(label);
        panel.add(label2);
        panel.add(label3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil++;
                label.setText("Result: " + mil +"x" + mad);
                label2.setText("Last scorer: AC Milan");
                if (mil > mad)
                    label3.setText("Winner: AC Milan");
                else if (mad > mil) {
                    label3.setText("Winner: Real Madrid");
                }
                else
                    label3.setText("Winner: DRAW");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mad++;
                label.setText("Result: " + mil +"x" + mad);
                label2.setText("Last scorer: Real Madrid");
                if (mil > mad)
                    label3.setText("Winner: AC Milan");
                else if (mad > mil) {
                    label3.setText("Winner: Real Madrid");
                }
                else
                    label3.setText("Winner: DRAW");
            }
        });
//добавили панель к фрейму
        frame.getContentPane().add(panel);

//упакуем во фрейм
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
