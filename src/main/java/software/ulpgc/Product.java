package software.ulpgc;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double priceWithDiscount(double discount) {
        return quantity * price * (1 - discount / 100);
    }
}