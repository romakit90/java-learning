package lesson22.autoboxingchallange;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer bill = new Customer("Bill");
        Customer mike = new Customer("Mike");
        Customer max = new Customer("Max");
        Customer kevin = new Customer("Kevin");

        Bank bank = new Bank();

        bank.addCustomer(bill);
        bank.addCustomer(mike);
        bank.addCustomer(max);
        bank.addCustomer(kevin);
        bank.printCustomers();
        bank.addTransaction(kevin, 5000.0);
        bank.addTransaction(kevin, -2342.0);
        System.out.println(kevin.getTransactionFormatted());

    }

}

class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
        transactions.add(10000.0);
    }

    public void addTransaction(Double amount) {
        transactions.add(amount);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getTransactionFormatted() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" transactions: \n");
        for (Double transaction : transactions) {
            sb.append(transaction).append("\n");

        }
        return sb.toString();
    }
}

class Bank {
    private String name;

    public Bank() {
        this.name = "Nord Bank";
    }


    private ArrayList<Customer> customersList = new ArrayList<>();


    public void addCustomer(Customer name) {
        if (customersList.contains(name)) {
            System.out.println(name + " already exist!");
        } else {
            customersList.add(name);
        }
    }

    public void printCustomers() {
        System.out.println("Bank: " + name);
        for (Customer i : customersList) {
            System.out.println(" - " + i);
        }
    }

    public void addTransaction(Customer name, Double amount) {

        if (!customersList.contains(name)) {
            System.out.println("No customer with name: " + name);
        } else {
            name.addTransaction(amount);
            System.out.println(name + " make a $" + amount + " transaction");
        }
    }

    @Override
    public String toString() {
        return name + "\n";
    }

}







