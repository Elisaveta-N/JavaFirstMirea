package task16;

//https://docs.oracle.com/javase/tutorial/uiswing/layout/group.html
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static javax.swing.GroupLayout.Alignment.*;


class KL implements KeyListener{
    JTextField _comp;
    String _str;
    KL(JTextField comp, String str)
    {
        _comp = comp;
        _str = str;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(_comp.getText().equals(_str))
            _comp.setForeground(Color.green);
        else
            _comp.setForeground(Color.black);
    }
}

class PasswordAppSample extends JFrame {
    JLabel lblService = new JLabel("Service");
    JLabel lblUser = new JLabel("User Name");
    JLabel lblPass = new JLabel("Password");
    JTextField txtService = new JTextField(30);
    JTextField txtUser = new JTextField(30);
    JTextField txtPass = new JTextField(30);

    PasswordAppSample() {
        super("Password application");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(TRAILING)
                        .addComponent(lblService)
                        .addComponent(lblUser)
                        .addComponent(lblPass)
                )
                .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(txtService)
                        .addComponent(txtUser)
                        .addComponent(txtPass)
                )
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(lblService)
                        .addComponent(txtService))
                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(lblUser)
                        .addComponent(txtUser))
                .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(lblPass)
                        .addComponent(txtPass))
        );

        KL klService = new KL(txtService, "Get five service");
        txtService.addKeyListener(klService);

        KL klUser = new KL(txtUser, "Liza");
        txtUser.addKeyListener(klUser);

        KL klPass = new KL(txtPass, "StrongPassword");
        txtPass.addKeyListener(klPass);

        setSize(420, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class PasswordApp
{

    public static void main(String[] args)
    {
        new PasswordAppSample();
    }

}