package main;
/*1.Создать абстрактный класс Figure с полем a - сторона. (для класса CircleFurniture это значение подразумевается - радиус)/*
/*2.Создать конструктор с параметром.(get, set, equals, hashcode, toString).*/
/*3.Cоздать классы SquareFurniture, CircleFurniture, которые наследуются от Figure.*/
/*4.Добавить в SquareFurniture поле – b – вторая сторона. */
/*5.Создать абстрактный метод в Figure для подсчета площади getSquareFigure(), соответственно переопределить в потомках.*/
/*6.Создать интерфейс с методом getPerimeter(), возвращающий периметр фигуры.Реализовать интерфейс у классов потомков.*/
/*7.Создать по 1 объекту классов потомков. Вывести всю информацию (объект, площадь, периметр).*/

public class Run {
    public static void main(String[] args) {
        SquareFurniture squareFurniture = new SquareFurniture(2, 3);
        System.out.println("object: " + squareFurniture);

    }

}
