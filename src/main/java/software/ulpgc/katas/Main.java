package software.ulpgc.katas;

public class Main {
    static void main() {
        Product product = new Product("Cuaderno", 4.5, 3);
        System.out.println(product.totalPrice());
    }
}