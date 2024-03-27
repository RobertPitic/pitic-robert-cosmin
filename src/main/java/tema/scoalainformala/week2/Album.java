package tema.scoalainformala.week2;

public class Album extends Book {
    String paperQuality;

    public Album(String name, int numberOfPages, String paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "Album:" + super.toString() + ", " +
                "paperQuality='" + paperQuality + '\'';
    }
}
