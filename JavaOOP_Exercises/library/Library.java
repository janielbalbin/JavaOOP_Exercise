package library;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) { books.add(b); }
    public void removeBook(Book b) { books.remove(b); }
}
