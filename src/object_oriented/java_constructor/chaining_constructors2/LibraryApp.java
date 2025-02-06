package object_oriented.java_constructor.chaining_constructors2;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        System.out.println();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println();

        library.displayBooks();

        library.removeBook("9780451524935");

        System.out.println();

        library.displayBooks();
    }
}
