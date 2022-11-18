public class Book {
    private String author;
    private String title;

    Book book = Book.of("Kuba", "Przez swiat");

     public Book(String author, String title) {
         this.author = author;
         this.title = title;
    }

    public static Book of (String author, String title){
        return new Book(author, title);
    }

    public static void main (String [] args){

       Book book = Book.of("Kuba", "Przez swiat");
        System.out.println("Ksiązka "+ book.title + book.title);
    }
}