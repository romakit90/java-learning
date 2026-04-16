package lesson08.oopchallenge;

public class Main {

    public static void main(String[] args) {

//        BankAccount account = new BankAccount(123456, 500.0, "John Doe",
//                "asus@java.com", "555-1234");
        BankAccount account = new BankAccount();

        System.out.println(account.getPhoneNumber());
        System.out.println(account.getBalance());

//        account.setAccountNumber(123456);
//        account.setCustomerName("John Doe");
//        account.setEmail("asus@java.com");
//        account.setPhoneNumber("555-1234");
//        account.setBalance(1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
        account.withdraw(-50.0);
        account.withdraw(300.0);
        account.deposit(-100.0);
        account.deposit(200.0);;

        BankAccount catAccount = new BankAccount("Cat Owner", "cat@dot.com", "234-2345");
        System.out.println("Cat Account - Name: " + catAccount.getCustomerName() + ", Email: " + catAccount.getEmail() +
                ", Phone: " + catAccount.getPhoneNumber() + ", Balance: $" + catAccount.getBalance());


    }
}
