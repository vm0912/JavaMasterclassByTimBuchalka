package ArraysListsAutoboxing.ArrayListChallenge;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public void storeContact(String contactName, String contactNumber) {
        if(findContact(contactName) != null){
            System.out.println("The contact with that name already exists, please change the name or select the \"modify\" option" );
        }
        else{
            contacts.add(new Contact(contactName,contactNumber));
            System.out.println("Contact sucessfully added!");
        }
    }

    public void listAllContacts(){
        if(contacts.isEmpty()){
            System.out.println("The list of contacts is empty.");
        } else {
            for (Contact contact : this.contacts){
                System.out.println("--------------\n" + contact);
            }
        }

    }

    public Contact findContact(String contactName) {
        Contact currentContact = new Contact(contactName);
        if (contacts.contains(currentContact)) {
            return contacts.get(findContactIndex(currentContact));
        }
        else{
            return null;
        }
    }

    private int findContactIndex(Contact currentContact){
        return contacts.indexOf(currentContact);
    }

    public void modifyContact(String oldContactName, String newContactName, String newNumber) {
        Contact oldContact = findContact(oldContactName);
        if(newContactName.isBlank()){
            if(newNumber.isBlank()){
                contacts.set(findContactIndex(oldContact),
                        new Contact(oldContactName, oldContact.getPhoneNumber()));
            } else{
                contacts.set(findContactIndex(oldContact), new Contact(oldContactName,newNumber ));
            }
        } else{
            if(newNumber.isBlank()){
                contacts.set(findContactIndex(oldContact),
                        new Contact(newContactName, oldContact.getPhoneNumber()));
            } else{
                contacts.set(findContactIndex(oldContact), new Contact(newContactName,newNumber ));
            }
        }
        System.out.println("Contact modified.");
    }

    public boolean deleteContact(String contactName) {
        Contact currentContact = new Contact(contactName);
        if(contacts.remove(currentContact)){
            System.out.println("Contact \"" + contactName + "\" sucessfuly removed.");
            return true;
        } else{
            System.out.println("Contact not found.");
            return false;
        }
    }


}
