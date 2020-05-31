package ConcurrencyInJava.Practice;

public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("CustomThread.run() called");
    }
}
