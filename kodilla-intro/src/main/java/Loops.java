import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        String[] names = new String[]{"Adam", "Ewa", "Krzysztof"};
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println("Zawartość tablicy: " + names[i]);
        }
System.out.println("Suma tablicy wynosi: "+sumNumbers());
    }
    public static int sumNumbers() {
        int[] numbers = new int[5];
        Scanner podaj = new Scanner(System.in);
        for (int j = 0; j < 5; j++){
            System.out.println("Podaj cyfrę ");
            numbers[j] = podaj.nextInt();
        }
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
    }






