import java.util.Scanner; // import klasy
/*tutaj skorzystałem z pomocy google aby pobrać jakoś dane od użytkownika. Nie wiem czy był to najlepszy wybór
* no ale spróbowałem coś poczytałem i nawet zadziałało :O   */

public class LeapYear {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in); //wywołanie obiektu (konstruktora) System.in --> strumień wejścia. Za bardzo tego jeszcze nie rozumiem
        System.out.println("Podaj rok, który zostanie sprawdzony czy jest rokiem przestępnym");
        int year = scan.nextInt(); //program jest "zatrzymany" do momentu kliknięcia entera
        System.out.println("Podałeś do weryfikacji: " +year);

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 100 == 0)){
            System.out.println("Podany rok ("+year+") jest rokiem przestępnym");
        } else {
            System.out.println("Podany rok ("+year+") nie jest rokiem przestępnym");
        }
    }
}
