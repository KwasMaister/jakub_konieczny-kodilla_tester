

public class Book {
    private static String author;
    private static String title;

    public static String of (String author, String title){
        Book.author = author;
        Book.title = title;
        return author + title;
    }

    public static void main (String [] args){
        Book.of("Kuba", "Przez swiat");
        System.out.println("Ksiązka " + author + " " + title);
    }

}