public class Calculator {
    static final double PI = 3.1415927;          // [1] static czyli takie pole, do którego możemy uzyskać dostęp bez potrzeby tworzenia obiektu klasy Calculator
                                                    // final --> oznaczamy stała, czyli wartość której nie możemy zmienić.
    static int counter = 0;

    public Calculator(){
        counter++;  // counter -> licznik
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double circleArea(double r) {
        String name = UserDialogs.getUsername();  //wywołanie metody, bezpośrednio na klasie – bez konieczności tworzenia obiektu tej klasy
        System.out.println("Hi, " + name + ". Thank you for using our software.");
        return PI * r * r;
    }

    public double circlePerimeter(double r) {
        return 2 * PI *r;
    }
}
