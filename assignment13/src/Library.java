// 11. Create a Library with a collection of books and methods to add and remove books.

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle()
                    + ", Author: " + book.getAuthor()
                    + ", ISBN: " + book.getIsbn());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Hobbit", "J. R. R. Tolkien", "9780547928227");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "9780141439518");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in the library:");
        library.displayBooks();

        library.removeBook(book1);

        System.out.println("After removing The Hobbit:");
        library.displayBooks();
    }
}
