import java.util.Scanner;

public class Book {
   private static String author;
    private static String title;

    public static String of (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj autora ksiazki");
        author = scanner.nextLine().trim();

        System.out.println("Podaj tytuł ksiazki");
        title = scanner.nextLine().trim();

        return author + title;

    }

    public static void main (String [] args){

        String book = Book.of();
        System.out.println("Autor: " + author);
        System.out.println("Tytuł: " + title);
    }
}
