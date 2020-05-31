package ArraysListsAutoboxing.autoboxingAndAutounboxingChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String bankName;
    private  static ArrayList<Branch> listOfBranches = new ArrayList<Branch>();
    private static Scanner scanner = new Scanner(System.in);
    private static boolean quit = false;
    private static boolean returnToMain = false;
    private static Branch currentBranch = null;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("OTP banka");
        printMainOptions();
        while (!quit) {
            System.out.println("Please enter your choice, or '0' for bank options: ");
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 0:
                    printMainOptions();
                    break;
                case 1:
                    listBranches();
                    break;
                case 2:
                    addANewBranch();
                    break;
                case 3:
                    selectABranch();
                    break;
                case 4:
                    turnOff();
                    break;
            }
        }

    }

    private static void selectABranch() {
        System.out.println("Please enter the existing branch ID:");
        int branchID = scanner.nextInt();
        currentBranch =getBranchByID(branchID);
        scanner.nextLine();
        if(currentBranch != null){
            printBranchOptions();
            while(!returnToMain){
                System.out.println("Please enter your choice, or '0' for branch options: ");
                int input = scanner.nextInt();
                scanner.nextLine();
                switch (input) {
                    case 0:
                        printBranchOptions();
                        break;
                    case 1:
                        listBranchCustomers();
                        break;
                    case 2:
                        addBranchCustomer();
                        break;
                    case 3:
                        addCustomerTransaction();
                        break;
                    case 4:
                        returnToMain();
                        break;
                }
            }


        }

    }

    private static void addCustomerTransaction() {
        System.out.println("Please enter the customer name:");
        String customerName = scanner.nextLine();
        Customer customer = currentBranch.findCustomer(customerName);
        if(customer != null){
            System.out.println("Please enter the transaction amount:");
            double transactionAmount = scanner.nextDouble();
            scanner.nextLine();
            currentBranch.addATransaction(customer, transactionAmount);
        } else{
            System.out.println("Customer with given name not found.");
        }


    }

    private static void addBranchCustomer() {
        System.out.println("Please enter the customer name:");
        String contactName = scanner.nextLine();
        System.out.println("Please enter the initial balance:");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine();
        currentBranch.addNewCustomer(contactName, initialBalance);
    }

    private static void listBranchCustomers() {
        System.out.println("Would you like to see the customer transactions? [Y/N]");
        String printTransactions = scanner.nextLine();
        boolean showTransactions = false;
        switch (printTransactions){
            case "Y":
                showTransactions = true;
                break;
            case "N":
                showTransactions = false;
                break;
            default:
                System.out.println("Invalid input, the transactions will not be displayed.");
                break;
        }
        if(currentBranch != null){
            currentBranch.listCustomers(showTransactions);
        }
    }


    private static void printMainOptions() {
        System.out.println("\nBANK OPTIONS");
        System.out.println("**************************");
        System.out.println("Enter a number of the option you wish to execute:");
        System.out.println("#1: Print list od branches.");
        System.out.println("#2: Add a branch.");
        System.out.println("#3: Select a branch.");
//        System.out.println("#2: List customers from a specific branch and/or their transactions.");
//        System.out.println("#4: Add a customer to a specific branch.");
//        System.out.println("#5 Add a transaction to a specific customer.");
        System.out.println("#4: Quit.\n");
    }

    private static void printBranchOptions(){
        System.out.println("\nBRANCH OPTIONS");
        System.out.println("**************************");
        System.out.println("Enter a number of the option you wish to execute:");
        System.out.println("#1: Print list od customers.");
        System.out.println("#2: Add a customer.");
        System.out.println("#3: Add a transaction to a specific customer.");
        System.out.println("#4: Return to the main menu.");
    }

    private static void listBranches() {
        if(listOfBranches.isEmpty()){
            System.out.println("Currently no branches.");
        } else {
            for(Branch branch : listOfBranches){
                System.out.println("Branch no." + branch.getBranchID());
            }
        }

    }

    private static void addANewBranch( ) {
        int lastBranchIndex = listOfBranches.size();
        listOfBranches.add(Branch.branchFactory(lastBranchIndex+1));
        System.out.println("Branch no." +(lastBranchIndex+1) + " added.");
    }

    private static void returnToMain(){
        System.out.println("\nReturning to main menu...\n");
        returnToMain = true;
        printMainOptions();
    }

    private static void turnOff() {
        System.out.println("Thank you for using the application!");
        quit = true;
    }

    private static Branch getBranchByID(int branchID){
        if(branchID <=0 || branchID > listOfBranches.size()){
            System.out.println("The requested branch not found.");
            return null;
        } else {
            int branchIndex = branchID - 1;
           return listOfBranches.get(branchIndex);
        }
    }


}
