package task16;

//https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TextAreaSample extends JFrame implements ActionListener {

    JMenu menuColor, menuFont;
    JMenuItem clBlue, clBlack, clRed, ft01, ft02, ft03;
    JTextArea text;
    TextAreaSample() {
        super("Text area sample");

        menuColor = new JMenu("Select Color");
        clBlue = new JMenuItem("Blue");
        clBlue.addActionListener(this);
        clBlack = new JMenuItem("Black");
        clBlack.addActionListener(this);
        clRed = new JMenuItem("Red");
        clRed.addActionListener(this);
        menuColor.add(clBlue);
        menuColor.add(clBlack);
        menuColor.add(clRed);

        menuFont = new JMenu("Select Font");
        ft01 = new JMenuItem("Times New Roman");
        ft01.addActionListener(this);
        ft02 = new JMenuItem("MS Sans Serif");
        ft02.addActionListener(this);
        ft03 = new JMenuItem("Courier New");
        ft03.addActionListener(this);
        menuFont.add(ft01);
        menuFont.add(ft02);
        menuFont.add(ft03);

        JMenuBar mb = new JMenuBar();
        mb.add(menuColor);
        mb.add(menuFont);
        setJMenuBar(mb);

        text = new JTextArea();
        add(text);
        text.setForeground(Color.BLUE);
        Font font = new Font("Segoe Script", Font.PLAIN, 14);
        text.setFont(font);


        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "Blue" -> text.setForeground(Color.BLUE);
            case "Black" -> text.setForeground(Color.BLACK);
            case "Red" -> text.setForeground(Color.RED);
            case "Times New Roman" -> {
                Font font = new Font("Times New Roman", Font.PLAIN, 14);
                text.setFont(font);
            }
            case "MS Sans Serif" -> {
                Font font = new Font("MS Sans Serif", Font.PLAIN, 14);
                text.setFont(font);
            }
            case "Courier New" -> {
                Font font = new Font("Courier New", Font.PLAIN, 14);
                text.setFont(font);
            }
        }

    }
}

public class TextArea
{

    public static void main(String[] args)
    {
        new TextAreaSample();
    }

}