package com.hashan.javacore.oop;

public class Sample {

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.length = 12;
        b1.height = 12;
        b1.width = 4;
        System.out.println(b1.calculateVolume());

        Box b2 = new Box(12,12,45);
        System.out.println(b2.calculateVolume());

    }

}

