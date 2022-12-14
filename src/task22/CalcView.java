package task22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface OnCalcEventListener {

    // this can be any type of method
    void onCalcEvent(String key);
}


public class CalcView extends JFrame implements ActionListener {
    JTextField txt;
    private OnCalcEventListener mListener; // listener field

    public void registerOnCalcEventListener(OnCalcEventListener mListener)
    {
        this.mListener = mListener;
    }


    public  CalcView()
    {
        super("MyCalculator");

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        txt = new JTextField();
        Font font = new Font("Courier New", Font.PLAIN, 30);
        txt.setFont(font);
        txt.setEditable(false);

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.gridwidth = 4;
        c.ipady = 50;
        add(txt, c);

        Font font_btn = new Font("Courier New", Font.PLAIN|Font.BOLD, 30);

        JButton btn_space = new JButton("Space");
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 4;
        c.ipady = 20;
        btn_space.addActionListener(this);
        add(btn_space, c);

        String[] array = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "+", "="};
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                JButton btn = new JButton(array[i*4+j]);
                btn.setFont(font_btn);
                c.gridx = j;
                c.gridy = i+2;
                c.gridwidth = 1;
                c.ipady = 30;
                btn.addActionListener(this);
                add(btn, c);
            }
        }

        setSize(415, 475);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    String getText()    {
        return txt.getText();
    }

    void setText(String s)    {
        txt.setText(s);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String s = source.getText();
        if(s.equals("Space"))
            s = " ";
        if (this.mListener != null) {
            mListener.onCalcEvent(s);
        }
    }

    /*
        public static void main(String[] args) {
        CalcView cv = new CalcView();
    }
    */



}

