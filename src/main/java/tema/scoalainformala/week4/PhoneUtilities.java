package tema.scoalainformala.week4;

public interface PhoneUtilities {
    void addContact(String phoneNumber, String firstName, String lastName);

    void contactsList();

    void call(String phoneNumber);

    void viewHistory();

    void sendMessage(String phoneNumber, String message);
    void viewMessages(String phoneNumber);

}
