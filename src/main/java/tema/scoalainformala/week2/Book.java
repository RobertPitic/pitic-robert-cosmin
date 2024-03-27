package tema.scoalainformala.week2;

public class Book {
    String name;
    int numberOfPages;

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book " +
                "name='" + name + '\'' +
                ", numberOfPages='" + numberOfPages +
                "'";
    }
}
