// 5. Write a Java program to create a class called "Book" with attributes for title,
//    author, and ISBN, and methods to add and remove books from a collection.

import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String isbn;

    // static means all Book objects share this collection.
    private static final ArrayList<Book> books = new ArrayList<>();

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public static void addBook(Book book) {
        books.add(book);
    }

    public static void removeBook(Book book) {
        books.remove(book);
    }

    public static void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle()
                    + ", Author: " + book.getAuthor()
                    + ", ISBN: " + book.getIsbn());
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", "J. R. R. Tolkien", "9780547928227");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "9780141439518");

        Book.addBook(book1);
        Book.addBook(book2);

        System.out.println("Books in the collection:");
        Book.displayBooks();

        Book.removeBook(book1);

        System.out.println("After removing The Hobbit:");
        Book.displayBooks();
    }
}
