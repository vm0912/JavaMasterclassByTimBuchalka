package OOP1ClassesConstructorsInheritance;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        //passing the default values to the other constructor
        this(294294, 150, "John Cave", "jc65@example.com","(+385) 951239574" );
        System.out.println("Empty constructor");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double funds){
        if(funds>=0){
            System.out.println("Balance before deposit: "+ this.getBalance());
            // also you can update the attribute directly because it's faster (e.g. this.balance += funds; )
            //it skipps the setter and avoids problems with inheritance
//            this.setBalance(this.getBalance()+funds);
            this.balance+= funds;
            System.out.println("Balance after deposit: "+this.getBalance());
        }
        return this.getBalance();
    }

    public double withdrawFunds(double funds){
        if(funds>=0 && this.getBalance()>=funds){
            System.out.println("Balance before withdrawal: "+ this.getBalance());
//            this.setBalance(this.getBalance()-funds);
            this.balance-=funds;
            System.out.println("Balance after withdrawal: "+this.getBalance());
        }
        return this.getBalance();
    }
}
