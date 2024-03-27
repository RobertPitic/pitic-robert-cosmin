package tema.scoalainformala.week2;

public class LibraryCatalog {
    Book[] books;
    public LibraryCatalog() {
        books = new Book[3];
    }

    public void addBook(int number, Book book) {
        if (number > 0 && number < books.length) {
            books[number] = book;
            System.out.println(book + " has been added to the library");
        } else
            System.out.println("Invalid number. No book has been added to the Library.");
    }

    public void deleteBook(int number) {
        if (number > 0 && number < books.length) {
            books[number] = null;
            System.out.println("Book number " + number + " deleted from the Library.");
        } else {
            System.out.println("Invalid number. No book deleted.");
        }
    }

    public void listAllBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }

}