package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        System.out.println("Obwod prostokata wynosi: " + rectangle.obwod());
        System.out.println("Pole powierzchni prostokata wynosi: " + rectangle.polePowierzchni());
        System.out.println(" ");

        Shape circle = new Circle(7);
        System.out.println("Obwod kola wynosi: " + circle.obwod());
        System.out.println("Pole powierzchni kola wynosi: " + circle.polePowierzchni());
        System.out.println(" ");

        Shape triangle = new Triangle(12,10,10,8);
        System.out.println("Obwod trojkata wynosi: " + triangle.obwod());
        System.out.println("Pole powierzchni trojkata wynosi: " + triangle.polePowierzchni());
        System.out.println(" ");
    }
}
