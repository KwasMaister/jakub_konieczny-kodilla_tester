public class Book {
    private String author;
    private String title;

     public Book(String author, String title) {   //konstruktor
         this.author = author;
         this.title = title;
    }

    public static Book of (String author, String title){  // metoda "of". Która zwraca obiekt Book
        return new Book(author, title);
    }

    public static void main (String [] args){

       Book book = Book.of("Kuba", "Przez swiat");  // wywołanie obiektu
        System.out.println("Ksiązka: "+ book.author + " " + book.title);
    }
}