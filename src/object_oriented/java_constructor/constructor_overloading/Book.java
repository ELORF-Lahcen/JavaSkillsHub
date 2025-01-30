package object_oriented.java_constructor.constructor_overloading;

public class Book {

    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title= title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book("Clean Code", "Ancle Bob", 300);
        Book book3 = new Book("Hakake", "Lahcen ELORF");

        System.out.println("Book1's title : " + book1.getTitle() + "\nBook1's author : " + book1.getAuthor() + "\nBook1's price : " + book1.getPrice());
        System.out.println();
        System.out.println("Book2's title : " + book2.getTitle() + "\nBook2's author : " + book2.getAuthor() + "\nBook2's price : " + book2.getPrice());
        System.out.println();
        System.out.println("Book3's title : " + book3.getTitle() + "\nBook3's author : " + book3.getAuthor() + "\nBook3's price : " + book3.getPrice());
    }
}
