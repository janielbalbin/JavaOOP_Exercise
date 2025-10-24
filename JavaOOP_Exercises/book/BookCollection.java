package book;

import java.util.ArrayList;

public class BookCollection {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) { books.add(b); }
    public void removeBook(Book b) { books.remove(b); }
}
