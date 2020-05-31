package ArraysListsAutoboxing.autoboxingAndAutounboxingChallenge;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<>();


    public Customer(String customerName, double initialAmount) {
            this.customerName = customerName;
            this.transactions.add(initialAmount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
        System.out.println("Transaction added.");
    }

    public static Customer customerFactory(String customerName, double initialAmount){
        if(initialAmount < 0 ) {
            System.out.println("Couldn't create the account, please make sure the initial amount is not negative.");
            return null;
        } else {
            return new Customer(customerName,initialAmount);
        }
    }
}
