package tema.scoalainformala.week9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student robika = new Student("robert", "pitic", LocalDate.of(2004, 6, 6), 'M', "134413411234");
        System.out.println(robika.getAge());
    }
}
