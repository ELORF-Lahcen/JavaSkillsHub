package object_oriented.java_constructor.chaining_constructors2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added : "+book);
    }

    public void removeBook(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getISBN().equals(isbn)){
                iterator.remove();
                System.out.println("Book removed : "+ book);
                return;
            }
        }
        System.out.println("No Book found with ISBN: "+isbn);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
        } else {
            System.out.println("Library Collection: ");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
