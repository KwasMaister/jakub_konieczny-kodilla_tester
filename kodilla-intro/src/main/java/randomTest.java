import java.util.Random;
import java.util.Scanner;

public class randomTest {
    public static void main (String [] args){
        Random randomLiczba = new Random();
        int numberToGuess = randomLiczba.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        boolean wasNumberGuessed = false;
        while (!wasNumberGuessed){
            System.out.println("Podaj liczbę: ");
            int userNumber = scanner.nextInt();

            if (userNumber > numberToGuess){
                System.out.println("Liczba jest za duża");
            } else if (userNumber < numberToGuess){
                System.out.println("Liczba jest za mała");
            } else {
                System.out.println("Brawo, trafiłeś !");
                wasNumberGuessed = true;
            }
        }
    }
}
