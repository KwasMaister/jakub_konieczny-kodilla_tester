public class AdvCalcApplication {
    public static void main (String [] args){
        AdvCalculator calculator = new AdvCalculator(); // tworzymy obiekt calculator
        double result = calculator.calculate(); // zmienna result i przypisuje wynik z metody calculate
        System.out.println("Result: " + result);
    }
}
