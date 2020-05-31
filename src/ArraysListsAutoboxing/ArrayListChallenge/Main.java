package ArraysListsAutoboxing.ArrayListChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("0957753392");
    private static boolean quit = false;
    public static void main(String[] args) {
        printOptions();
        while (!quit) {
            System.out.println("Please enter your choice, or '0' for options: ");
                int input = scanner.nextInt();
                scanner.nextLine();
                switch (input) {
                    case 0:
                        printOptions();
                        break;
                    case 1:
                        listAllContacts();
                        break;
                    case 2:
                        storeContact();
                        break;
                    case 3:
                        modifyContact();
                        break;
                    case 4:
                        deleteContact();
                        break;
                    case 5:
                       findContact();
                        break;
                    case 6:
                        powerOff();
                        break;
                }
        }

    }

    private static void powerOff() {
        System.out.println("Thank you for using the mobile phone!");
        quit = true;
    }

    private static void findContact() {
        System.out.println("Please enter the contact name: ");
        Contact contact = myPhone.findContact(scanner.nextLine());
        if(contact != null){
            System.out.println(contact);
        } else {
            System.out.println("Contact not found!");
        }
    }


    private static void printOptions() {
        System.out.println("\nMOBILE PHONE OPTIONS");
        System.out.println("**************************");
        System.out.println("Enter a number of the option you wish to execute:");
        System.out.println("#1: Print list od contacts.");
        System.out.println("#2: Add a contact.");
        System.out.println("#3: Modify a contact.");
        System.out.println("#4: Remove a contact.");
        System.out.println("#5: Find a specific contact.");
        System.out.println("#6: Quit.\n");
    }

    public static void listAllContacts(){
        myPhone.listAllContacts();
    }

    public static void storeContact() {
        System.out.println("Please enter the contact name:");
        String contactName = scanner.nextLine();
        System.out.println("Please enter the contact number:");
        String contactNumber = scanner.nextLine();
        myPhone.storeContact(contactName,contactNumber);
    }


    private static void deleteContact() {

        System.out.println("Please enter the contact name:");
        String contactName = scanner.nextLine();
        myPhone.deleteContact(contactName);

    }


    private static void modifyContact() {
        System.out.println("Please enter the old contact name:");
        String oldName = scanner.nextLine();
        if(myPhone.findContact(oldName) != null) {
            System.out.println("Please enter the new contact name or leave blank to skip this part:");
            String newName = scanner.nextLine();
            System.out.println("Please enter the new number or leave blank to skip this part:");
            String newNumber = scanner.nextLine();
            myPhone.modifyContact(oldName,newName,newNumber);
        } else{
            System.out.println("Contact not found!");
        }
    }
}
