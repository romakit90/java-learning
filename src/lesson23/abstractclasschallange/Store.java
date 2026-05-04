package lesson23.abstractclasschallange;

import java.util.ArrayList;

public class Store {
    private ArrayList<OrderItem> orderList = new ArrayList<>();

    public static void main(String[] args) {

        Store store = new Store();
        Milk milk = new Milk();
        Apples apples = new Apples();
        Oranges oranges = new Oranges();

        store.addItemToOrder(new OrderItem(5, apples));
        store.addItemToOrder(new OrderItem(4, oranges));
        store.addItemToOrder(new OrderItem(5,milk));


        store.printOrderedItems();


    }


    public void addItemToOrder(OrderItem items) {
        orderList.add(items);
    }

    public void printOrderedItems() {

        for(OrderItem item : orderList) {
            System.out.println(item);
        }
    }
}

abstract class ProductForSale {

    protected String type;
    protected String description;
    protected double price;

    public ProductForSale() {}

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedItem(int quantity) {

        System.out.println(quantity + " " + type + " = $" + quantity*price);

    }

    public abstract void showDetails();
}

class OrderItem{

    private int quantity;
    private ProductForSale productForSale;

    public OrderItem(int quantity, ProductForSale productForSale) {
        this.quantity = quantity;
        this.productForSale = productForSale;
    }


    public int getQuantity() {
        return quantity;
    }

    public ProductForSale getProductForSale() {
        return productForSale;
    }

    @Override
    public String toString() {


        double lineTotal = productForSale.getSalesPrice(quantity);
        return String.format("%-30s = %10s", String.format("%d x (%s)", quantity, productForSale),String.format("$%.2f", lineTotal));

    }
}
