package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;
/*
import jest potrzebny poniewaz klasa Square znajduje się w innym pakiecie niż klasa ShapesListApplication
 */

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>(); //przypisanie do zmiennej "shapes" nowy obiekt klasy ArrayList (czyli najczęściej używanej implementacji interfejsu List)
        /*
        Podsumujmy, co właśnie zrobiliśmy: w powyższym kodzie utworzyliśmy zmienną shapes typu List<Square>,
        a także przypisaliśmy do niej nową, pustą kolekcję w postaci obiektu klasy ArrayList.

        Nawiasy <Square> po lewej stronie to jest typ obiektow znajdujacy sie wenwtarz kolekcji

        Nawiasy <> po prawej stronie w nich nie musisz już umieszczać informacji o typie elementów (a nawet nie należy tego robić)

        ArrayList ma formę tablicy z kolejnymi elementami danych – w takiej strukturze operacje wyszukiwania są bardzo szybkie,
        natomiast operacje wstawiania nowych danych są wolne, ponieważ wymagają "przepisania" całej tablicy z danymi do nowej tablicy o zwiększonym rozmiarze.
         */

        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

        /*
        for (int n = 0; n < shapes.size(); n++){
            Square square = shapes.get(n); //get - pobieramy jeden obiekt (o indeksie n) i wartosc jest umieszczana w zmiennej "square" typu Square
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
        A poniżej petfla for each
        Efekt koncowy taki sam jak powyzej
         */

        for (Square square : shapes){ //for (Typ zmienna : kolekcja)
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
    }
}
