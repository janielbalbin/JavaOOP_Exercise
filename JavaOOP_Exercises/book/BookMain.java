package book;

public class BookMain {
    public static void main(String[] args) {
        BookCollection bc = new BookCollection();
        Book b1 = new Book("Java", "John", "123");
        bc.addBook(b1);
        System.out.println("Book added: " + b1.title);
    }
}
