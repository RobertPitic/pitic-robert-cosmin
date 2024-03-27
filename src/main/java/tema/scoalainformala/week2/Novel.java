package tema.scoalainformala.week2;

public class Novel extends Book {
    String type;

    public Novel(String name, int numberOfPages, String type) {
        super(name, numberOfPages);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel:" + super.toString() + ", " +
                "type='" + type + '\'';
    }
}
