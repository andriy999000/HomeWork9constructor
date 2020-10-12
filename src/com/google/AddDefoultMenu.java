package com.google;

import java.util.Scanner;

public class AddDefoultMenu {
    public static void start(){
        String[][] arrCompositions = new String[3][5];
        arrCompositions[0][0] = "Томатный соус";
        arrCompositions[0][1] = "Моцарелла";
        arrCompositions[0][2] = "Пармезан";
        arrCompositions[0][3] = "Вареная ветчина";
        arrCompositions[0][4] = "Грибы";

        arrCompositions[1][0] = "Лук зеленый";
        arrCompositions[1][1] = "Буженина";
        arrCompositions[1][2] = "Томатный соус";
        arrCompositions[1][3] = "Бекон";
        arrCompositions[1][4] = "Помидор";

        arrCompositions[2][0] = "Рыба";
        arrCompositions[2][1] = "Салат";
        arrCompositions[2][2] = "Ананас";
        arrCompositions[2][3] = "Перец Чили";
        arrCompositions[2][4] = "Молочный соус";


        int[] arrDiameters = {14,18,20};
        String[] arrNames = {"Итальянская","Украинская","VIP"};
        double[] arrCosts = {20.9,23.0,30.0};

        Pizzeria pizzeria = new Pizzeria(3,arrCompositions,arrDiameters,arrNames,arrCosts);
        pizzeria.info();
    }
}
