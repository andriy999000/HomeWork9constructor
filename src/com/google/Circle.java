package com.google;

public class Circle {
    private int radius;

    private double S;
    private String color;
    private double circumference;
    private static final double PI = Math.PI;


    public Circle(int radius) {
        this.radius = radius;
        circumference = 2 * (radius * PI);
        S = (radius * radius) * PI;
    }



    public Circle(int radius,String colorVL) {
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getS() {
        return S;
    }

    public void setS(double s) {
        S = s;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
}
