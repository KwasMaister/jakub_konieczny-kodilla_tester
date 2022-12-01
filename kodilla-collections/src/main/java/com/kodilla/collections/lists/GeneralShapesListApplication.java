package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle; // a czy tutaj moge zaimportowac cos z zupelnie innego pakietu ? np z pakietu "kodiila-intro" ?
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>(); //przypisanie do zmiennej "shapes" nowego obiektu klasy LinkedList
        /*
            LinkedList - operacja wstawiania nowego obiektu sa bardzo szybkie, natomiast wyszukiwanie juz nieco wolniejsze
            (czasem wymaga przejścia, element po elemencie, przez całą kolekcję danych, aby odszukać właściwy element).
         */

        Square square = new Square(10.0); // Tworzymy obiekt klasy Square i zapamietujemy go w zmiennej o nazwie square
        shapes.add(square);
       // shapes.add(new Square(10.0));
        shapes.add(new Circle(7.0));
        shapes.add(new Triangle(10.0, 4.0, 10.77));

        shapes.remove(1); // usuwamy element z kolekcji o indeksie 1 (w tym wypadku Circle)
        shapes.remove(square); // usuwamy zmienna square z kolekcji

        Triangle triangle = new Triangle(10.0, 4.0, 10.77);
        shapes.remove(triangle);

        System.out.println(shapes.size());  // wyswietlenie rozmiaru kolekcji
        for (Shape shape : shapes){ //for (Typ zmienna : kolekcja)
            System.out.println(shape + ", area: " + shape.getArea() + ", perimeter: " + shape.getPerimeter());
        }
    }
}
