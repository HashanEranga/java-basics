package com.hashan.javacore.oop.oop.jframes;

import javax.swing.*;

public class Sample {
    public static void main(String[] args) {
        JFrame frame1; // create a reference variable of box
        frame1= new JFrame(); // create an object of Box
        System.out.println(frame1);
        frame1.setSize(200,300);
        frame1.setTitle("First form");
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);

    }
}
