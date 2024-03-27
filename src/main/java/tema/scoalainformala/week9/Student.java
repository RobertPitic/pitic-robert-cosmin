package tema.scoalainformala.week9;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    char gender;
    String id;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, char gender, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
    public void validateStudentData(String firstName, String lastName, LocalDate dateOfBirth, char gender, String id) {
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("First name and last name cannot be empty");
        }
        if (dateOfBirth == null || dateOfBirth.isBefore(LocalDate.of(1900, 1, 1)) || dateOfBirth.isAfter(LocalDate.now().minusYears(18))) {
            throw new IllegalArgumentException("Date of birth should be between 1900 and current year, and he/she should have 18 years or more");
        }
        if (gender != 'M' && gender != 'F') {
            throw new IllegalArgumentException("Gender should be 'M' or 'F'");
        }
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID (CNP) cannot be empty");
        }
    }
}


