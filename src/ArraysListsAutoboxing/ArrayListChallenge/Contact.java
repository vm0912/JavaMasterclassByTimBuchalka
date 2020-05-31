package ArraysListsAutoboxing.ArrayListChallenge;

import java.util.Objects;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this(name);
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name) {
        this.name = name;
        this.phoneNumber = "unknown";
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact name: " + this.name + "\nContact number: " + this.phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
