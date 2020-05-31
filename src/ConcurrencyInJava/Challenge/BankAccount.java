package ConcurrencyInJava.Challenge;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
For the challenge 2 the class was made Threadsafe by adding the synchronize keyword which was added
to the deposit and withdraw methods. Better solution is to use synchronized block inside a method because
it is important to minimize the synchronized code.
For the challenge 3 the methods getAccountNumber and printAccountNumber were added and the class
had to be made threadsafe again, but the methods don't change the instance fields so we do not need to
synchronize them.
For the challenge 4 the ReentrantLock was used for synchronization.
For the challenge 5 the tryLock method is used instead of reentrantLock.lock()
For the challenge 6 the boolean status variable needs to be threadsafe, but it is already threadsafe because
it is stored on the thread stack and each thread has its own copy.
 */
public class BankAccount {

    private double balance;
    private String accountNumber;
    private ReentrantLock reentrantLock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.reentrantLock = new ReentrantLock();

    }
// Challenge 2
//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }

    //Challenge 2 alternative
//    public void deposit(double amount) {
//        synchronized (this){
//            balance += amount;
//        }
//    }
//
//    public void withdraw(double amount) {
//        synchronized (this){
//            balance -= amount;
//        }
//    }

    public void deposit(double amount) {
        boolean status = false;
        //challenge 4
//        reentrantLock.lock();
        //challenge 5
        try {
            if (reentrantLock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try{
                    balance += amount;
                    status = true;
                }finally {
                    reentrantLock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Transaction status = " + status);
    }

    public void withdraw(double amount) {
        boolean status = false;
        //challenge 4
//        reentrantLock.lock();
        //challenge 5
        try {
            if (reentrantLock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try{
                    balance -= amount;
                    status = true;
                }finally {
                    reentrantLock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Transaction status = " + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number = " + accountNumber);
    }

    public double getBalance() {
        return balance;
    }
}
