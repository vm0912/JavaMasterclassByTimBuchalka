package OOP1ClassesConstructorsInheritance;

public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer() {
        this("John Doe", "jdoe@email.com",100000.0d);
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, "unknown", creditLimit);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
