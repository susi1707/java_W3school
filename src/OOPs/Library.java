package OOPs;

import java.util.ArrayList;
class Book{
    String title;
    Double price;


    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
public class Library {
    ArrayList<Book> books ;

    Library(){
        this.books = new ArrayList<>();
    }
    ArrayList<Book> addBooks(Book book){
        books.add(book);
        return books;
    }
    ArrayList<Book> removeBooks(Book book){
        books.remove(book);
        return books;
    }


    public static void main(String[] args) {
        Library lib = new Library();
        Book book1 = new Book("Harry Potter", 12.5);
        Book book2 = new Book("Lord of the rings", 120.5);
        lib.addBooks(book1);
        lib.addBooks(book2);
        lib.removeBooks(book2);
        int bookCount=0;
        for(Book res: lib.books){
            bookCount++;
            System.out.println("Book "+bookCount+"{"+res);
        }
    }
}
