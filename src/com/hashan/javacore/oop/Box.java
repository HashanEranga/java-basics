package com.hashan.javacore.oop;

public class Box {
    int length;
    int width;
    int height;
    int volume;

    public Box(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box() {

    }

    public int calculateVolume() {
        volume = length * width * height;
        return volume;
    }
}
