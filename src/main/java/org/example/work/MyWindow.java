package org.example.work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");

        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me !!");

        button.addActionListener((ActionEvent e )->{
                    System.out.println("Button click ");
                    JOptionPane.showMessageDialog(null,"Hey button click");
                });

                frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
