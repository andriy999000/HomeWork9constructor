package com.google;


import java.util.Arrays;

public class Pizza {
    private Circle basis;
    private String[] composition;
    private String name;
    private double cost;

    public Pizza(int diameter, String[] composition, String name, double cost) {
        this.composition = composition;
        this.name = name;
        this.cost = cost;
        basis = new Circle(diameter / 2);
    }


    public void info(){
        System.out.println("\nНазвание пиццы: " + name
                + "\nДиаметер пиццы: " + (basis.getRadius() * 2)
                + "\nСостав пиццы: " + Arrays.toString(composition)
                + "\nЦена: " + cost
        );
    }
}
