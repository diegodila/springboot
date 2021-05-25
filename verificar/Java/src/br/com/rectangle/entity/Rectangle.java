package br.com.rectangle.entity;

import java.awt.desktop.AboutEvent;

public class Rectangle {
    private double widht;
    private double height;

    public Rectangle(double widht, double height) {
        this.widht = widht;
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        return widht * height;
    }
    public double perimeter(){
        return (widht*2) + (height*2);
    }
    public double diagonal(){
        return (Math.pow(widht,2)) + (Math.pow(height,2));
    }

}
