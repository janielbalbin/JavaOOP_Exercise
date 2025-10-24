package library;

public class LibraryMain {
    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("1984", "George Orwell");
        lib.addBook(b1);
        System.out.println("Added: " + b1.title);
    }
}
