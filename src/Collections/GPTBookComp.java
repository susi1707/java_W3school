package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Book {
    String title;
    int page;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", page=" + page +
                '}';
    }

    public Book(String title, int page) {
        this.title = title;
        this.page = page;
    }


}
public class GPTBookComp {
    public static void main(String[] args) {
        ArrayList<Book> book1 = new ArrayList<>();
        book1.add(new Book("asd",12));
        book1.add(new Book("asasdd",10));
        book1.add(new Book("asvbvd",3));
        book1.add(new Book("a34sd",2));
        Collections.sort(book1, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if(o1.page > o2.page){
                    return 1;
                } else if (o1.page < o2.page) {
                    return -1;
                }
                return 0;
            }
        });
        for (Book res: book1
             ) {
            System.out.println(res);
        }
    }
}
