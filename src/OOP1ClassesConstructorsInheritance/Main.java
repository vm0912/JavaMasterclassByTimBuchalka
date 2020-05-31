package OOP1ClassesConstructorsInheritance;

public class Main {

    public static void main(String[] args) {
        Car tesla = new Car();
        System.out.println("The class of our newly created object is "+ tesla.getClass().getSimpleName());
        System.out.println("model of the car is "+tesla.getModel());
        tesla.setModel("Model S");
        System.out.println("model of the car is "+tesla.getModel());
        tesla.setModel("Model abc");
        System.out.println("model of the car is "+tesla.getModel());
        System.out.println("number of the doors is "+ tesla.getDoors());

        BankAccount firstAccount = new BankAccount();
//        firstAccount.setBalance(100);
        firstAccount.depositFunds(150);
        firstAccount.withdrawFunds(200);


        //testing vipCustomer class
        VipCustomer customer = new VipCustomer();
        System.out.println("customer's name is "+customer.getName());

        VipCustomer customer2 = new VipCustomer("Tim Buchalka", "tbuchalka@email.com", 99999  );
        System.out.println("Customer "+ customer2.getName() + " has the credit card limit of "+ customer2.getCreditLimit());


        Vehicle mazda = new ManualTransmissionCar();
        ManualTransmissionCar opel = new ManualTransmissionCar();
        mazda.move(60);
        System.out.println("class of the vehicle is " + mazda.getClass().getSimpleName());
        //mazda.changeGears() currently not possible because it is a reference to a Vehicle class
        ((ManualTransmissionCar) mazda).changeGears(5);
    }
}
