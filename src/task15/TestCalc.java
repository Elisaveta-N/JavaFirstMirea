package task15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TestCalc extends JFrame implements ActionListener{

    public void actionPerformed(ActionEvent ae) {
        try{
            Object source = ae.getSource();
            //переменная для хранения ввода в текстовое поле 1
            double x1 = Double.parseDouble(jta1.getText().trim());
            //переменная для хранения ввода в текстовое поле 2
            double x2 = Double.parseDouble(jta2.getText().trim());
            //создаем всплывающее окно INFORMATION_MESSAGE
            if(source == btnPlus)
                JOptionPane.showMessageDialog(null,
                        "Result =" + (x1+x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
            else if(source == btnMinus)
                JOptionPane.showMessageDialog(null,
                        "Result =" + (x1-x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
            else if(source == btnMul)
                JOptionPane.showMessageDialog(null,
                        "Result =" + (x1*x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
            else if(source == btnDiv)
                JOptionPane.showMessageDialog(null,
                        "Result =" + (x1/x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            //создаем всплывающее окно ERROR_MESSAGE
            JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
        }
    }
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton btnPlus = new JButton("+");
    JButton btnMinus = new JButton("-");

    JButton btnMul = new JButton("x");

    JButton btnDiv = new JButton("/");



    //Font fnt = new Font("Times new roman",Font.BOLD,20);
    //начало конструктора класса LabExample
    TestCalc(){
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);
        // создаем надпись 1
        add(new JLabel("1st Number"));
        // добавляем текстовое поле jta1
        add(jta1);
        // создаем надпись 2
        add(new JLabel("2nd Number"));
        // добавляем текстовое поле jta2
        add(jta2);
        // добавляем кнопку
        add(btnPlus);
        add(btnMinus);
        add(btnMul);
        add(btnDiv);

        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    } // конец конструктора




    public static void main(String[]args){
        new TestCalc();
    } // конец main()
} // конец класса LabExample