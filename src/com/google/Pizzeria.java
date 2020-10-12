package com.google;



public class Pizzeria {
    int quantity = 0;
    Pizza[] pizzs;



    public Pizzeria(int quantity,String[][] arrComposition,int[] arrDiameter,String[] arrName , double[] arrCost) {
        this.quantity = quantity;
        pizzs = new Pizza [quantity];
        for (int i = 0; i < pizzs.length; i++) {
            pizzs[i] = new Pizza(arrDiameter[i],arrComposition[i],arrName[i],arrCost[i]);

        }
    }

    public void info() {
        for (int i = 0; i < pizzs.length; i++) {
            pizzs[i].info();

        }
    }
}
