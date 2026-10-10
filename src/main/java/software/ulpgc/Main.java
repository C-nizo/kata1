package software.ulpgc;

public class Main {
    static void main() {
        Product product = new Product("Pegamento en barra", 3.5, 2);
        System.out.println(product.totalPrice(20));
    }
}