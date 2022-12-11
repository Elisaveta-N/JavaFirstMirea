package task15;
import javax.swing.*;
import java.awt.*;

class MenuExample extends JFrame{
    JMenu menuFile, menuEdit, menuHelp;
    JMenuItem f1, f2, e1, e2, e3, h1;

    GridLayout Layout = new GridLayout(2,1);
    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JTextArea text = new JTextArea("This is area where you can write text");
    JPanel pan_top = new JPanel();
    JPanel pan_bot = new JPanel();

    MenuExample() {
        super("Hello Swing");

        menuFile = new JMenu("File");
        f1 = new JMenuItem("Save");
        f2 = new JMenuItem("Exit");
        menuFile.add(f1);
        menuFile.add(f2);

        menuEdit = new JMenu("Edit");
        e1 = new JMenuItem("Copy");
        e2 = new JMenuItem("Cut");
        e3 = new JMenuItem("Paste");
        menuEdit.add(e1);
        menuEdit.add(e2);
        menuEdit.add(e3);

        menuHelp = new JMenu("Help");
        h1 = new JMenuItem("Help");
        menuHelp.add(h1);

        JMenuBar mb = new JMenuBar();
        mb.add(menuFile);
        mb.add(menuEdit);
        mb.add(menuHelp);
        setJMenuBar(mb);

        setSize(250, 140);

        pan_top.add(btn1);
        pan_top.add(btn2);
        pan_bot.add(text);
        add(pan_top);
        add(pan_bot);
        setLayout(Layout);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


public class TestMenu
{

    public static void main(String[] args)
    {
        new MenuExample();
    }

}