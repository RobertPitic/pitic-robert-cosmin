package tema.scoalainformala.week4;

import java.util.List;
import java.util.ArrayList;


abstract class Phone implements PhoneUtilities {
    String model;
    int batteryLife;
    String color;
    String material;
    List<String> contacts;
    List<String> callHistory;
    List<String> messages;

    public Phone(String model, int batteryLife, String color, String material) {
        this.model = model;
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.contacts = new ArrayList<>();
        this.callHistory = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    @Override
    public void addContact(String phoneNumber, String firstName, String lastName) {
        contacts.add(firstName + " " + lastName + ": " + phoneNumber);
    }

    @Override
    public void contactsList() {
        System.out.println();
        System.out.println("Contacts:");
        for (String contact : contacts) {
            System.out.println(contact);
        }
    }

    @Override
    public void call(String phoneNumber) {
        callHistory.add("Call made to " + phoneNumber);
        System.out.println("Calling " + phoneNumber);
        batteryLife -= 2;
        System.out.print("Battery life has decreased by 2 hours, " + batteryLife + " hours left.");
    }

    @Override
    public void viewHistory() {
        System.out.println("Call History:");
        for (String call : callHistory) {
            System.out.println(call);
        }
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {

        if (message.length() > 500)
            System.out.println("Can't send messages longer than 500 characters");
        else {
            batteryLife -= 1;
            messages.add(message);
            System.out.println("message sent to " + phoneNumber + " " + ": " + message);
            System.out.println("Battery life has decreased by 1 hour, " + batteryLife + " hours left.");
        }

    }

    @Override
    public void viewMessages(String phoneNumber) {
        System.out.println("Messages to " + phoneNumber + ":");
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
