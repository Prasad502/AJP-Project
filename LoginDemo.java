package com.swing.examples;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo extends JFrame implements ActionListener {

    JPanel panel;
    JLabel user_label, password_label, message,status;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;

    LoginDemo() {
        
        // User Label
        user_label = new JLabel();
        user_label.setText("User Name :");
        userName_text = new JTextField();
        user_label.setBounds(50,50, 150,20);
        
        // Password

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();
        password_label.setBounds(100,100, 150,20);
        // Submit
        status = new JLabel();
        status.setText("LOGIN STATUS");
        
        submit = new JButton("SUBMIT");

        panel = new JPanel(new GridLayout(4,2));

        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);
        panel.add(status);
        message = new JLabel();
        panel.add(message);
        panel.add(submit);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding the listeners to components..
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Please Login Here !");
        setSize(300, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new LoginDemo();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String userName = userName_text.getText();
        String password = password_text.getText();
        if (userName.trim().equals("admin") && password.trim().equals("0000"))
        {
            status.setText("LOGIN VALID");
        } 
        else 
        {
            status.setText("LOGIN INVALID");
        }

    }

}