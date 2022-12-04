public class CalcApplication {
    public static void main (String [] args){
        Calculator calculator = new Calculator(); // zainicjowanie obiektu
        double area = calculator.circleArea(10); //wywolanie metody circleArea
        System.out.println("Area of the Circle with radius 10 equals: " + area);

        double p = Calculator.PI;
        System.out.println("The value of a pi constant is equal to " + p); // [2]

        Calculator calculator2 = new Calculator(); // zainicjowanie drugiego obiektu
        System.out.println(calculator2.counter);
    }
}
