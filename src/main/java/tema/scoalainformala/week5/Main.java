package tema.scoalainformala.week5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Comparator<Person> ageComparator = Comparator.comparing(Person::getAge);
        Set<Person> compareByName = new TreeSet<>(nameComparator);
        Set<Person> compareByAge = new TreeSet<>(ageComparator);

        Person person1 = new Person("Robi", 19);
        Person person2 = new Person("Viorel", 18);

        compareByName.add(person1);
        compareByName.add(person2);

        compareByAge.add(person1);
        compareByAge.add(person2);

        System.out.println("comparison made by name: ");
        for (Person person : compareByName) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }

        System.out.println();

        System.out.println("comparison made by age: ");
        for (Person person : compareByAge) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }

        Map<Person, List<Hobby>> personHobbies = new HashMap<>();
        List<String> addresses1 = new ArrayList<>();
        addresses1.add("outside");
        addresses1.add("gym");
        List<String> addresses2 = new ArrayList<>();
        addresses2.add("pool");
        addresses2.add("beach");


        Hobby hobby1 = new Hobby("Cycling", 4, addresses1);
        Hobby hobby2 = new Hobby("Swimming", 1, addresses2);

        personHobbies.put(person1, Arrays.asList(hobby1, hobby2));

        System.out.println("\nHobbies for " + person1.getName() + ":");
        for (Hobby hobby : personHobbies.get(person1)) {
            System.out.println("Hobby: " + hobby.getName() + " " + hobby.getFrequency() + " times per week.");
            System.out.println("Addresses: " + hobby.getAddresses());
        }
    }
}
