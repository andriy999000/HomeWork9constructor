package com.google;

public class Main {

    public static void main(String[] args) {
        



        /*
        1 Создание класса с конструктором
        1.1 Создать класс Circle. Описать поля: радиус длинна окружности, площадь, цвет.
                Создать 2 конструктора, в которые передавать параметры: радиус, и цвет и радиус.
        1.2 Параметры площадь и длинна окружности расcчитать в конструкторе на основе
        радиуса и Pi. Примечание число PI можно взять из класса Math, Math.PI.
        1.3 Создать метод main, в котором создать экземпляр класса Circle. Вывести на экран
        сообщение с данными о длинне окружности, площади и цвета.


        */

    Circle circle = new Circle(5);
        circle.setColor("blue");
        System.out.println(circle.getCircumference());
        System.out.println(circle.getS());
        System.out.println(circle.getColor());


        /*
        2 Создание комплексного класса.
        2.1 Создать класс Pizza. Описать поля:
        basis – поле типа Circle
        composition – состав пиццы
        name – название пиццы
        cost – цена.
        2.2 Создать конструктор, который принимает в качестве параметров имя, состав, цену и
        диаметр пиццы. Внутри конструктора создать объект класса Circle применив диаметр.
        2.3 Создать класс Pizzeria c методом main в котором создать массив из разных пицц.
        2.4 Вывести в цикле информацию о каждой пицце.
        2.5 Написать JavaDoc для всех классов.

    */


        AddDefoultMenu.start();




    }
}