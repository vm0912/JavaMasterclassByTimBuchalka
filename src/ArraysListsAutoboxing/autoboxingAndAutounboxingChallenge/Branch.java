package ArraysListsAutoboxing.autoboxingAndAutounboxingChallenge;

import java.util.ArrayList;

public class Branch {
    private int branchID;
    private ArrayList<Customer> listOfCustomers = new ArrayList<Customer>();

    public Branch(int branchID) {
        this.branchID = branchID;
    }

    public static Branch branchFactory(int lastBranchIndex){
        return new Branch(lastBranchIndex);
    }

    public int getBranchID() {
        return branchID;
    }

    public void addNewCustomer(String customerName, double initialTransactionAmount) {
        if(findCustomer(customerName) != null){
            System.out.println("The customer with that name is already registered at our branch.");
        } else {
            this.listOfCustomers.add(Customer.customerFactory(customerName,initialTransactionAmount));
        }
    }



    public void addATransaction(Customer customer, double amount) {
        customer.addTransaction(amount);
    }


    public Customer findCustomer(String customerName) {
        for(Customer customer : listOfCustomers){
            if(customer.getCustomerName().equals(customerName)){
                return this.listOfCustomers.get(findCustomerIndex(customer));
            }
        }
        return null;
    }

    private int findCustomerIndex(Customer customer) {
        return this.listOfCustomers.indexOf(customer);
    }

    public void listCustomers(boolean showTransactions) {
        if(listOfCustomers.isEmpty()){
            System.out.println("The list of customers is empty.");
        }
        for (Customer customer : listOfCustomers) {
            System.out.println("Customer: " + customer.getCustomerName());
            if (showTransactions) {
                System.out.println("Transactions: ");
                for (Double transaction : customer.getTransactions()) {
                    System.out.println((transaction <0 )? "" : "+" + transaction + "hrk");
                }
            }
            System.out.println("-----------------------------");
        }
    }
}
