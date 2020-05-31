package ConcurrencyInJava.Challenge;

/*
Create two threads which use the same bank account and make a deposit and withdraw with each.
 */
public class Challenge1 {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("012484185", 1000.0);
        Thread firstPerson = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1.1.....balance is : " + bankAccount.getBalance());
                bankAccount.deposit(300.00);
                bankAccount.withdraw(50.00);
                System.out.println("1.2.....balance is : " + bankAccount.getBalance());

            }
        });
        Thread secondPerson = new Thread(() -> {
            System.out.println("2.1....balance is : " + bankAccount.getBalance());
            bankAccount.deposit(203.75);
            bankAccount.withdraw(100);
            System.out.println("2.2....balance is : " + bankAccount.getBalance());

        });
        firstPerson.start();
        secondPerson.start();

    }
}
