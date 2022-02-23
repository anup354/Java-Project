/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author anpka
 */
import javax.swing.*;
import java.awt.*;

public class SigninForm{
    JFrame f1;
    JLabel l1,l2;
   JTextField t1,t2;
    JButton b1;
    SigninForm(){
        f1=new JFrame("Login Form");
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        l1=new JLabel("User :");
        l2=new JLabel("Password :");
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("Submit");
       
        l1.setBounds(10, 10, 80, 25);
        f1.add(l1);
        t1.setBounds(100, 10, 80, 25);
        f1.add(t1);
        l2.setBounds(10, 45, 80, 25);
        f1.add(l2);
        t2.setBounds(100, 45, 80, 25);
        f1.add(t2);
        b1.setBounds(100, 75, 80, 25);
        f1.add(b1);  
        f1.setVisible(true);  
    }
    public static void main(String[] args) {
        SigninForm ob = new SigninForm();
    }
}
