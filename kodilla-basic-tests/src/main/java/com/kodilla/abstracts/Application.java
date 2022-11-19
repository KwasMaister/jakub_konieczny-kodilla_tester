package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
            /*
                Dog dog = new Dog(); {   // możemy również zadeklarować obiekt w taki sposób: Animal dog = new Dog ();
                dog.giveVoice();        // bo klasa Dog dziedziczy po klasie Animal. Wiec Pies należy do zwierzat (eureka xD)

                Stosujac to co poniżej:
                Stosując taką konstrukcję, możemy wywołać wszystkie metody nieprywatne znajdujące się w klasie Animal
                – nie możemy użyć metod zdefiniowanych tylko w klasie Dog.
            */
            Animal dog = new Dog();

            AnimalProcessor processor = new AnimalProcessor();{
                processor.process(dog);
        }

        Duck duck = new Duck(); {
            duck.giveVoice();
        }
    }
}
