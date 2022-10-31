import java.net.SocketOption;
import java.util.Scanner;

public class NewProject {
    public static void main (String[] args){
        System.out.println("Podaj swoje imie");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Witaj "+name + " !");

        if (!name.isEmpty() && (!name.endsWith("a") || name.equals("Kuba") || name.equals("Barnaba"))) {
            System.out.println("Jesteś mężczyzną !");
        } else if (!name.isEmpty() && name.endsWith("a")){
            System.out.println("Jesteś Kobietą !");
        } else {
            System.out.println("Podaj imię, imię nie może byc puste");
        }
        ageCheck();
        name();
    }
    public static String ageCheck(){
        System.out.println("Podaj swój wiek");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String result = null;
        if (age >= 18){
            System.out.println("Jesteś pełnoletni / pełnoletnia !");
        } else {
            System.out.println("Jesteś niepełnoletni / niepełnoletnia !");
        }
        return result;
    }
    public static void name(){
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        System.out.println("Podaj ile imion chcesz podać");
        size = scanner.nextInt();
        String [] names = new String[size];

        for (int i = 0; i <= names.length; i++){
            System.out.println("Podaj imie");
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i <= names.length; i++){
            System.out.println("Podałeś następujące imiona: " +names[i]);
        }

    }
}
