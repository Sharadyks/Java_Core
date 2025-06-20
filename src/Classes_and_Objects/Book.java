package Classes_and_Objects;

public class Book {
    boolean isborrow;
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;

    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn){
        this(isbn, "unknown","unknown");
    }
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    void borrowBook(){
        if (isborrow){
            System.out.println("Book is already borrowed");
        } else {
            this.isborrow = true;
            System.out.println("Enjoy the book");
        }

    }
    void returnBook(){
        if (isborrow){
            this.isborrow = false;
            System.out.println("Hope you enjoyed the book");
        }
        else{
            System.out.println("The book is already in library");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("256A","The loving Soul","Sharad Sharma");
        book1.borrowBook();
        System.out.println(book1.author);
        book1.returnBook();
    }
}
