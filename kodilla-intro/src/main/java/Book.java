public class Book {
    private static String author;
    private static String title;

    public Book(String author, String title) {
    }

    public static Book of (String author, String title){
        Book.author = author;
        Book.title = title;
        return new Book(author, title);
    }

    public static void main (String [] args){

       Book book = Book.of("Kuba", "Przez swiat");
        System.out.println("Ksiązka " + author + " " + title);
    }
}