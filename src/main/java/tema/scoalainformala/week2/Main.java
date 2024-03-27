package tema.scoalainformala.week2;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        Novel novel = new Novel("Happy", 274, "Fiction");
        Album album = new Album("Wedding photos", 61, "High Quality");

        libraryCatalog.addBook(1, album);
        libraryCatalog.addBook(2, novel);
        libraryCatalog.deleteBook(1);
        libraryCatalog.listAllBooks();
    }
}
